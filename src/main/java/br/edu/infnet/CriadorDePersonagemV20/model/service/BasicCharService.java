package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.BasicCharRepository;

@Service
public class BasicCharService {
	@Autowired
	private BasicCharRepository basicCharRepository;
	
	public void add(BasicChar basicChar) {
		basicCharRepository.save(basicChar);
	}
	
	public Collection<BasicChar> pullList(){
		return(Collection<BasicChar>) basicCharRepository.findAll();
	}
	
	public Optional<BasicChar> pull(Integer id){
		Optional<BasicChar> basicCharPulled = basicCharRepository.findById(id);
		return basicCharPulled;
	}
}
