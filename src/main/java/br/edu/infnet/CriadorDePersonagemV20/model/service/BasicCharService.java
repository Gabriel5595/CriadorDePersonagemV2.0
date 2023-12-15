package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.util.Collection;
import java.util.Optional;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.BasicCharRepository;

@Service
public class BasicCharService {
	@Autowired
	private BasicCharRepository basicCharRepository;

	@Autowired
	private AddressService addressService;
	
	public void add(BasicChar basicChar) {
		String cep = basicChar.getAddress().getCep();

		Address address = addressService.findAddress(cep);

		basicChar.setAddress(address);

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
