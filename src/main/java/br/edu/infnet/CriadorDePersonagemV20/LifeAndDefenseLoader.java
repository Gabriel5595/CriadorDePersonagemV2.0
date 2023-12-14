package br.edu.infnet.CriadorDePersonagemV20;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Armor;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.Attributes;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterClass;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.LifeAndDefense;
import br.edu.infnet.CriadorDePersonagemV20.model.service.ArmorService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.AttributesService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.CharacterClassService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.LifeAndDefenseService;

@Order(10)
@Component
public class LifeAndDefenseLoader implements ApplicationRunner {
	@Autowired
	private LifeAndDefenseService lifeAndDefenseService;
	@Autowired
	private CharacterClassService characterClassService;
	@Autowired
	private ArmorService armorService;
	@Autowired
	private AttributesService attributesService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		Optional<Attributes> attributesPulled = attributesService.pull(1);
		Attributes attributesFormatted = attributesPulled.orElse(new Attributes());
		
		for (int i = 1; i <= 3; i++) {
			Optional<Armor> armorPulled = armorService.pull(i);
			Armor armorFormatted = armorPulled.orElse(new Armor());
			
			Optional<CharacterClass> characterClassPulled = characterClassService.pull(i);
			CharacterClass characterClassFormatted = characterClassPulled.orElse(new CharacterClass());
			
			LifeAndDefense lifeAndDefense = new LifeAndDefense();
			lifeAndDefense.calculateLifeAndDefense(characterClassFormatted, armorFormatted, attributesFormatted);
			
			lifeAndDefenseService.add(lifeAndDefense);
			System.out.println(lifeAndDefense);
		}
	}
}
