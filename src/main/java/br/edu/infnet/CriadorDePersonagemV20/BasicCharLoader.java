package br.edu.infnet.CriadorDePersonagemV20;

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
		
		basicChar.setNomePersonagem("Eldred");
		basicChar.setNomeJogador("Gabriel");
		basicChar.setLevel(1);
		
		basicCharService.add(basicChar);
	}

}
