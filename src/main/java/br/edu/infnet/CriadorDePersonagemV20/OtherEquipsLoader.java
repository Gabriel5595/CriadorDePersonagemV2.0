package br.edu.infnet.CriadorDePersonagemV20;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.OtherEquips;
import br.edu.infnet.CriadorDePersonagemV20.model.service.OtherEquipsService;

@Order(9)
@Component
public class OtherEquipsLoader implements ApplicationRunner{
	@Autowired
	private OtherEquipsService otherEquipsService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/equipment.txt");
		BufferedReader read = new BufferedReader(file);
		
		String line = read.readLine();
		String[] fields = null;
		
		while(line != null) {
			fields = line.split(";");

			OtherEquips otherEquips = new OtherEquips();
			otherEquips.setEquipName(fields[0]);
			otherEquips.setAmount(Integer.valueOf(fields[1]));
			
			otherEquipsService.add(otherEquips);
			
			System.out.println(otherEquips);
			
			line = read.readLine();
		}
		
		read.close();
	}
}
