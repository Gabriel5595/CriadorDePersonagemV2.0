package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Skills")
public class Skills {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private boolean acrobatics;
    private boolean animalHandling;
    private boolean arcana;
    private boolean athletics;
    private boolean deception;
    private boolean history;
    private boolean insight;
    private boolean intimidation;
    private boolean investigation;
    private boolean medicine;
    private boolean nature;
    private boolean perception;
    private boolean performance;
    private boolean persuasion;
    private boolean religion;
    private boolean sleightOfHand;
    private boolean stealth;
    private boolean survival;
    
    public Skills() {}
	
	public Skills(Integer id) {
		this.id = id;
	}

	public Skills(boolean acrobatics, boolean animalHandling, boolean arcana, boolean athletics,
			boolean deception, boolean history, boolean insight, boolean intimidation, boolean investigation,
			boolean medicine, boolean nature, boolean perception, boolean performance, boolean persuasion,
			boolean religion, boolean sleightOfHand, boolean stealth, boolean survival) {
		this.acrobatics = acrobatics;
		this.animalHandling = animalHandling;
		this.arcana = arcana;
		this.athletics = athletics;
		this.deception = deception;
		this.history = history;
		this.insight = insight;
		this.intimidation = intimidation;
		this.investigation = investigation;
		this.medicine = medicine;
		this.nature = nature;
		this.perception = perception;
		this.performance = performance;
		this.persuasion = persuasion;
		this.religion = religion;
		this.sleightOfHand = sleightOfHand;
		this.stealth = stealth;
		this.survival = survival;
	}

	@Override
	public String toString() {
		return "Skills [id=" + id + ", acrobatics=" + acrobatics + ", animalHandling=" + animalHandling + ", arcana="
				+ arcana + ", athletics=" + athletics + ", deception=" + deception + ", history=" + history
				+ ", insight=" + insight + ", intimidation=" + intimidation + ", investigation=" + investigation
				+ ", medicine=" + medicine + ", nature=" + nature + ", perception=" + perception + ", performance="
				+ performance + ", persuasion=" + persuasion + ", religion=" + religion + ", sleightOfHand="
				+ sleightOfHand + ", stealth=" + stealth + ", survival=" + survival + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isAcrobatics() {
		return acrobatics;
	}

	public void setAcrobatics(boolean acrobatics) {
		this.acrobatics = acrobatics;
	}

	public boolean isAnimalHandling() {
		return animalHandling;
	}

	public void setAnimalHandling(boolean animalHandling) {
		this.animalHandling = animalHandling;
	}

	public boolean isArcana() {
		return arcana;
	}

	public void setArcana(boolean arcana) {
		this.arcana = arcana;
	}

	public boolean isAthletics() {
		return athletics;
	}

	public void setAthletics(boolean athletics) {
		this.athletics = athletics;
	}

	public boolean isDeception() {
		return deception;
	}

	public void setDeception(boolean deception) {
		this.deception = deception;
	}

	public boolean isHistory() {
		return history;
	}

	public void setHistory(boolean history) {
		this.history = history;
	}

	public boolean isInsight() {
		return insight;
	}

	public void setInsight(boolean insight) {
		this.insight = insight;
	}

	public boolean isIntimidation() {
		return intimidation;
	}

	public void setIntimidation(boolean intimidation) {
		this.intimidation = intimidation;
	}

	public boolean isInvestigation() {
		return investigation;
	}

	public void setInvestigation(boolean investigation) {
		this.investigation = investigation;
	}

	public boolean isMedicine() {
		return medicine;
	}

	public void setMedicine(boolean medicine) {
		this.medicine = medicine;
	}

	public boolean isNature() {
		return nature;
	}

	public void setNature(boolean nature) {
		this.nature = nature;
	}

	public boolean isPerception() {
		return perception;
	}

	public void setPerception(boolean perception) {
		this.perception = perception;
	}

	public boolean isPerformance() {
		return performance;
	}

	public void setPerformance(boolean performance) {
		this.performance = performance;
	}

	public boolean isPersuasion() {
		return persuasion;
	}

	public void setPersuasion(boolean persuasion) {
		this.persuasion = persuasion;
	}

	public boolean isReligion() {
		return religion;
	}

	public void setReligion(boolean religion) {
		this.religion = religion;
	}

	public boolean isSleightOfHand() {
		return sleightOfHand;
	}

	public void setSleightOfHand(boolean sleightOfHand) {
		this.sleightOfHand = sleightOfHand;
	}

	public boolean isStealth() {
		return stealth;
	}

	public void setStealth(boolean stealth) {
		this.stealth = stealth;
	}

	public boolean isSurvival() {
		return survival;
	}

	public void setSurvival(boolean survival) {
		this.survival = survival;
	}
	
	
}
