package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.LifeAndDefense;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.LifeAndDefenseRepository;

@Service
public class LifeAndDefenseService {
	@Autowired
	private LifeAndDefenseRepository lifeAndDefenseRepository;
	
	public void add(LifeAndDefense lifeAndDefense) {
		lifeAndDefenseRepository.save(lifeAndDefense);
	}
	
	public Collection<LifeAndDefense> pullList(){
		return (Collection<LifeAndDefense>) lifeAndDefenseRepository.findAll();
	}
	
	public Optional<LifeAndDefense> pull(Integer id){
		Optional<LifeAndDefense> skillModsPulled = lifeAndDefenseRepository.findById(id);
		return skillModsPulled;
	}
}
