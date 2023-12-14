package br.edu.infnet.CriadorDePersonagemV20;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Armor;
import br.edu.infnet.CriadorDePersonagemV20.model.service.ArmorService;

@Order(8)
@Component
public class ArmorLoader implements ApplicationRunner{
	@Autowired
	private ArmorService armorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/armor.txt");
		BufferedReader read = new BufferedReader(file);
		
		String line = read.readLine();
		String[] fields = null;
		
		while(line != null) {
			fields = line.split(";");

			Armor armor = new Armor();
			armor.setArmorName(fields[0]);
			armor.setArmorType(fields[1]);
			armor.setDefense(Integer.valueOf(fields[2]));
			armor.setStrengthRequired(Integer.valueOf(fields[3]));
			armor.setStealthDisadvantage(Boolean.valueOf(fields[4]));
			
			armorService.add(armor);
			
			System.out.println(armor);
			
			line = read.readLine();
		}
		
//		Optional<Armor> armorPulled = armorService.pull(1);
//		
//		Armor armorFormated = armorPulled.orElse(new Armor());
//		System.out.println("Os dados rescuperos são; " + armorFormated);
		
		read.close();
	}
}
