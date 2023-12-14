package br.edu.infnet.CriadorDePersonagemV20;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Skills;
import br.edu.infnet.CriadorDePersonagemV20.model.service.SkillsService;

@Order(5)
@Component
public class SkillsLoader implements ApplicationRunner{
	@Autowired
	private SkillsService skillsService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
			Skills skillsRanger = new Skills();
			skillsRanger.setAcrobatics(false);
			skillsRanger.setAnimalHandling(true);
			skillsRanger.setArcana(false);
			skillsRanger.setAthletics(false);
			skillsRanger.setDeception(false);
			skillsRanger.setHistory(false);
			skillsRanger.setInsight(false);
			skillsRanger.setIntimidation(false);
			skillsRanger.setInvestigation(false);
			skillsRanger.setMedicine(false);
			skillsRanger.setNature(false);
			skillsRanger.setPerception(true);
			skillsRanger.setPerformance(false);
			skillsRanger.setPersuasion(false);
			skillsRanger.setReligion(false);
			skillsRanger.setSleightOfHand(false);
			skillsRanger.setStealth(false);
			skillsRanger.setSurvival(true);
			
			Skills skillsRogue = new Skills();
			skillsRogue.setAcrobatics(true);
			skillsRogue.setAnimalHandling(false);
			skillsRogue.setArcana(false);
			skillsRogue.setAthletics(true);
			skillsRogue.setDeception(true);
			skillsRogue.setHistory(false);
			skillsRogue.setInsight(false);
			skillsRogue.setIntimidation(false);
			skillsRogue.setInvestigation(false);
			skillsRogue.setMedicine(false);
			skillsRogue.setNature(false);
			skillsRogue.setPerception(true);
			skillsRogue.setPerformance(false);
			skillsRogue.setPersuasion(false);
			skillsRogue.setReligion(false);
			skillsRogue.setSleightOfHand(false);
			skillsRogue.setStealth(false);
			skillsRogue.setSurvival(false);
			
			Skills skillsWarrior = new Skills();
			skillsWarrior.setAcrobatics(false);
			skillsWarrior.setAnimalHandling(false);
			skillsWarrior.setArcana(false);
			skillsWarrior.setAthletics(true);
			skillsWarrior.setDeception(false);
			skillsWarrior.setHistory(false);
			skillsWarrior.setInsight(false);
			skillsWarrior.setIntimidation(false);
			skillsWarrior.setInvestigation(false);
			skillsWarrior.setMedicine(false);
			skillsWarrior.setNature(false);
			skillsWarrior.setPerception(true);
			skillsWarrior.setPerformance(false);
			skillsWarrior.setPersuasion(false);
			skillsWarrior.setReligion(false);
			skillsWarrior.setSleightOfHand(false);
			skillsWarrior.setStealth(false);
			skillsWarrior.setSurvival(false);
			
			skillsService.add(skillsRanger);
			skillsService.add(skillsRogue);
			skillsService.add(skillsWarrior);
			
		}
}

