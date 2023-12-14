package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Armor;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.ArmorRepository;

@Service
public class ArmorService {
	@Autowired
	private ArmorRepository armorRepository;
	
	public void add(Armor weapon) {
		armorRepository.save(weapon);
	}
	
	public Collection<Armor> pullList(){
		return (Collection<Armor>) armorRepository.findAll();
	}
	
	public Optional<Armor> pull(Integer id){
		Optional<Armor> armorPulled = armorRepository.findById(id);
		return armorPulled;
	}
}
