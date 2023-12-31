package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.io.IOException;
import java.util.*;

import br.edu.infnet.CriadorDePersonagemV20.clients.IAddressClient;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterClass;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.CharacterClassRepository;

@Service
public class CharacterClassService {

	@Autowired
	private CharacterClassRepository characterClassRepository;



	public void add(CharacterClass characterClass) {
		characterClassRepository.save(characterClass);
	}

	public Collection<CharacterClass> pullList(){
		return (Collection<CharacterClass>) characterClassRepository.findAll();
	}

	public Optional<CharacterClass> pull(Integer id){
		Optional<CharacterClass> armorPulled = characterClassRepository.findById(id);
		return armorPulled;
	}
}
