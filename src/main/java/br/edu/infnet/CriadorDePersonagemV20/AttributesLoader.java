package br.edu.infnet.CriadorDePersonagemV20;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Attributes;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;
import br.edu.infnet.CriadorDePersonagemV20.model.service.AttributesService;

@Order(2)
@Component
public class AttributesLoader implements ApplicationRunner{
	@Autowired
	private AttributesService attributesService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Attributes attributes = new Attributes();
		List<Integer> fullDrawList = Attributes.drawAttributes();
		
		attributes.setStregth(fullDrawList.get(0));
		attributes.setDexterity(fullDrawList.get(1));
		attributes.setConstitution(fullDrawList.get(2));
		attributes.setIntelligence(fullDrawList.get(3));
		attributes.setWisdom(fullDrawList.get(4));
		attributes.setCharisma(fullDrawList.get(5));
		
		attributes.addAttributeMods();
		
		attributes.setBasicChar(new BasicChar(1));
		
		System.out.println("O resultado da união das tabelas é: " + attributes);
		
		attributesService.add(attributes);
	}
}
