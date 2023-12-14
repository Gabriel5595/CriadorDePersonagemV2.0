package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Skills;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.SkillsRepository;

@Service
public class SkillsService {
	@Autowired
	private SkillsRepository skillsRepository;
	
	public void add (Skills skills) {
		skillsRepository.save(skills);
	}
	
	public Collection<Skills> pullList(){
		return(Collection<Skills>) skillsRepository.findAll();
	}
	
	public Optional<Skills> pull(Integer id){
		Optional<Skills> skillsPulled = skillsRepository.findById(id);
		return skillsPulled;
	}
}
