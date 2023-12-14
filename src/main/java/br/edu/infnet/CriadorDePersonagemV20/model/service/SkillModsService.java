package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.SkillMods;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.SkillModsRepository;

@Service
public class SkillModsService {
	@Autowired
	private SkillModsRepository skillModsRepository;
	
	public void add(SkillMods skillMods) {
		skillModsRepository.save(skillMods);
	}
	
	public Collection<SkillMods> pullList(){
		return (Collection<SkillMods>) skillModsRepository.findAll();
	}
	
	public Optional<SkillMods> pull(Integer id){
		Optional<SkillMods> skillModsPulled = skillModsRepository.findById(id);
		return skillModsPulled;
	}
}
