package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.OtherEquips;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.OtherEquipsRepository;

@Service
public class OtherEquipsService {
	@Autowired
	private OtherEquipsRepository otherEquipsRepository;
	
	public void add (OtherEquips otherEquips) {
		otherEquipsRepository.save(otherEquips);
	}
	
	public Collection<OtherEquips> pullList(){
		return(Collection<OtherEquips>) otherEquipsRepository.findAll();
	}
	
	public Optional<OtherEquips> pull(Integer id){
		Optional<OtherEquips> otherEquipsPulled = otherEquipsRepository.findById(id);
		return otherEquipsPulled;
	}
}
