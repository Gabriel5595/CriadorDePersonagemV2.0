package br.edu.infnet.CriadorDePersonagemV20;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterClass;
import br.edu.infnet.CriadorDePersonagemV20.model.service.CharacterClassService;

@Order(4)
@Component
public class CharacterClassLoader implements ApplicationRunner{
	@Autowired
	private CharacterClassService characterClassService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		FileReader file = new FileReader("files/class.txt");
		BufferedReader read = new BufferedReader(file);

		String line = read.readLine();
		String[] fields = null;

		while(line != null) {
			fields = line.split(";");

			CharacterClass characterClass = new CharacterClass();
			characterClass.setClassName(fields[0]);
			characterClass.setLifeDice(fields[1]);

			characterClassService.add(characterClass);

			System.out.println(characterClass);

			line = read.readLine();
		}

		read.close();
	}
}
