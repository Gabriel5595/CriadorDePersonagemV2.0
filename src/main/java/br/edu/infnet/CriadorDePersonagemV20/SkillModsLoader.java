package br.edu.infnet.CriadorDePersonagemV20;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Attributes;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.SkillMods;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.Skills;
import br.edu.infnet.CriadorDePersonagemV20.model.service.AttributesService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.SkillModsService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.SkillsService;

@Order(6)
@Component
public class SkillModsLoader implements ApplicationRunner {
	@Autowired
	private SkillModsService skillModsService;
	
	@Autowired
	private SkillsService skillService;
	
	@Autowired
	private AttributesService attributesService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		for (int i = 0; i <= 2; i++) {
			Optional<Skills> skillsPulled = skillService.pull(i);
			Skills skillsFormated = skillsPulled.orElse(new Skills());
			
			Optional<Attributes> attributesPulled = attributesService.pull(1);
			Attributes attributesFormated = attributesPulled.orElse(new Attributes());
			
			SkillMods skillMods = new SkillMods();
			skillMods.calculateSkillMods(skillsFormated, attributesFormated);
			
			skillModsService.add(skillMods);
			System.out.println(skillMods);
		}
		
	}
}
