package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterClass;
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

    public Optional<CharacterRace> pull(Integer id){
        Optional<CharacterRace> characterRacePulled = characterRaceRepository.findById(id);
        return characterRacePulled;
    }
}
