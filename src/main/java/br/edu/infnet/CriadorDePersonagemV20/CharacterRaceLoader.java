package br.edu.infnet.CriadorDePersonagemV20;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterRace;
import br.edu.infnet.CriadorDePersonagemV20.model.service.CharacterRaceService;

@Order(3)
@Component
public class CharacterRaceLoader implements ApplicationRunner{
	@Autowired
	private CharacterRaceService characterRaceService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/race.txt");
		BufferedReader read = new BufferedReader(file);
		
		String line = read.readLine();
		String[] fields = null;
		
		while(line != null) {
			fields = line.split(";");

			CharacterRace characterRace = new CharacterRace();
			characterRace.setRaceName(fields[0]);
			characterRace.setSize(fields[1]);
			characterRace.setDisplacement(fields[2]);
			
			characterRaceService.add(characterRace);
			
			System.out.println(characterRace);
			
			line = read.readLine();
		}
		
		read.close();
	}
}
