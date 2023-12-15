package br.edu.infnet.CriadorDePersonagemV20;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;
import br.edu.infnet.CriadorDePersonagemV20.model.service.BasicCharService;

@Order(1)
@Component
public class BasicCharLoader implements ApplicationRunner{
	@Autowired
	private BasicCharService basicCharService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		BasicChar basicChar = new BasicChar();
		
		basicChar.setCharacterName("Eldred");
		basicChar.setPlayerName("Gabriel");
		basicChar.setLevel(1);
		basicChar.setAddress(new Address("21321230"));

		basicCharService.add(basicChar);
	}

}
