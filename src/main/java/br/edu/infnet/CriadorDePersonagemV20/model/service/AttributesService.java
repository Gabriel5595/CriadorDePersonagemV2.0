package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Attributes;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.AttributesRepository;

@Service
public class AttributesService {
	@Autowired
	private AttributesRepository attributesRepository;
	
	public void add (Attributes attributes) {
		attributesRepository.save(attributes);
	}
	
	public Collection<Attributes> pullList(){
		return(Collection<Attributes>) attributesRepository.findAll();
	}
	
	public Optional<Attributes> pull(Integer id){
		Optional<Attributes> attributesPulled = attributesRepository.findById(id);
		return attributesPulled;
	}
	
}
