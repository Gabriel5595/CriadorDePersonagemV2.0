package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterRace;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.CharacterRaceRepository;


@Service
public class CharacterRaceService {
	@Autowired
	private CharacterRaceRepository characterRaceRepository;
	
	public void add(CharacterRace characterRace) {
		characterRaceRepository.save(characterRace);
	}
	
	public Collection<CharacterRace> pullList(){
		return (Collection<CharacterRace>) characterRaceRepository.findAll();
	}
	
	public CharacterRace readJson(String raceName) throws IOException {
        String path ="./files/raca/Raca_"+raceName+".json";
        File jsonFile = new File(path);

        if (!jsonFile.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonFile, CharacterRace.class);
    }
}
