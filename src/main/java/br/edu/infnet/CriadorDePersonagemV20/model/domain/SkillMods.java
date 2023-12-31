package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SkillsMods")
public class SkillMods {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private int acrobaticsMod;
	private int animalHandlingMod;
	private int arcanaMod;
	private int athleticsMod;
	private int deceptionMod;
	private int historyMod;
	private int insightMod;
	private int intimidationMod;
	private int investigationMod;
	private int medicineMod;
	private int natureMod;
	private int perceptionMod;
	private int performanceMod;
	private int persuasionMod;
	private int religionMod;
	private int sleightOfHandMod;
	private int stealthMod;
	private int survivalMod;
	
	public SkillMods() {}
    
    public SkillMods(Integer id) {
		this.id = id;
	}

	public SkillMods(Integer id, int acrobaticsMod, int animalHandlingMod, int arcanaMod, int athleticsMod, int deceptionMod, int historyMod, int insightMod, int intimidationMod, int investigationMod, int medicineMod, int natureMod, int perceptionMod, int performanceMod, int persuasionMod, int religionMod, int sleightOfHandMod, int stealthMod, int survivalMod) {
		this.id = id;
		this.acrobaticsMod = acrobaticsMod;
		this.animalHandlingMod = animalHandlingMod;
		this.arcanaMod = arcanaMod;
		this.athleticsMod = athleticsMod;
		this.deceptionMod = deceptionMod;
		this.historyMod = historyMod;
		this.insightMod = insightMod;
		this.intimidationMod = intimidationMod;
		this.investigationMod = investigationMod;
		this.medicineMod = medicineMod;
		this.natureMod = natureMod;
		this.perceptionMod = perceptionMod;
		this.performanceMod = performanceMod;
		this.persuasionMod = persuasionMod;
		this.religionMod = religionMod;
		this.sleightOfHandMod = sleightOfHandMod;
		this.stealthMod = stealthMod;
		this.survivalMod = survivalMod;
	}

	@Override
	public String toString() {
		return "SkillModsController [id=" + id + ", acrobaticsMod=" + acrobaticsMod + ", animalHandlingMod=" + animalHandlingMod
				+ ", arcanaMod=" + arcanaMod + ", athleticsMod=" + athleticsMod + ", deceptionMod=" + deceptionMod
				+ ", historyMod=" + historyMod + ", insightMod=" + insightMod + ", intimidationMod=" + intimidationMod
				+ ", investigationMod=" + investigationMod + ", medicineMod=" + medicineMod + ", natureMod=" + natureMod
				+ ", perceptionMod=" + perceptionMod + ", performanceMod=" + performanceMod + ", persuasionMod="
				+ persuasionMod + ", religionMod=" + religionMod + ", sleightOfHandMod=" + sleightOfHandMod
				+ ", stealthMod=" + stealthMod + ", survivalMod=" + survivalMod + "]";
	}

	public void calculateSkillMods(Skills skills, Attributes attributes) {
		setAcrobaticsMod(skills, attributes);
        setAnimalHandlingMod(skills, attributes);
        setArcanaMod(skills, attributes);
        setAthleticsMod(skills, attributes);
        setDeceptionMod(skills, attributes);
        setHistoryMod(skills, attributes);
        setInsightMod(skills, attributes);
        setIntimidationMod(skills, attributes);
        setInvestigationMod(skills, attributes);
        setMedicineMod(skills, attributes);
        setNatureMod(skills, attributes);
        setPerceptionMod(skills, attributes);
        setPerformanceMod(skills, attributes);
        setPersuasionMod(skills, attributes);
        setReligionMod(skills, attributes);
        setSleightOfHandMod(skills, attributes);
        setStealthMod(skills, attributes);
        setSurvivalMod(skills, attributes);
	}
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getAcrobaticsMod() {
		return acrobaticsMod;
	}

	public void setAcrobaticsMod(Skills skills, Attributes attributes) {
		if (skills.isAcrobatics()) {
			this.acrobaticsMod = attributes.getModDex() + 2;
		} else {
			this.acrobaticsMod = attributes.getModDex();
		}
	}

	public int getAnimalHandlingMod() {
		return animalHandlingMod;
	}

	public void setAnimalHandlingMod(Skills skills, Attributes attributes) {
		if (skills.isAnimalHandling()) {
			this.animalHandlingMod = attributes.getModWis() + 2;
		} else {
			this.animalHandlingMod = attributes.getModWis();
		}
	}

	public int getArcanaMod() {
		return arcanaMod;
	}

	public void setArcanaMod(Skills skills, Attributes attributes) {
		if (skills.isArcana()) {
			this.arcanaMod = attributes.getModInt() + 2;
		} else {
			this.arcanaMod = attributes.getModInt();
		}
	}

	public int getAthleticsMod() {
		return athleticsMod;
	}

	public void setAthleticsMod(Skills skills, Attributes attributes) {
		if (skills.isAthletics()) {
			this.athleticsMod = attributes.getModStr() + 2;
		} else {
			this.athleticsMod = attributes.getModStr();
		}
	}

	public int getDeceptionMod() {
		return deceptionMod;
	}

	public void setDeceptionMod(Skills skills, Attributes attributes) {
		if (skills.isDeception()) {
			this.deceptionMod = attributes.getModDex() + 2;
		} else {
			this.deceptionMod = attributes.getModDex();
		}
	}

	public int getHistoryMod() {
		return historyMod;
	}

	public void setHistoryMod(Skills skills, Attributes attributes) {
		if (skills.isHistory()) {
			this.historyMod = attributes.getModInt() + 2;
		} else {
			this.historyMod = attributes.getModInt();
		}
	}

	public int getInsightMod() {
		return insightMod;
	}

	public void setInsightMod(Skills skills, Attributes attributes) {
		if (skills.isHistory()) {
			this.historyMod = attributes.getModInt() + 2;
		} else {
			this.historyMod = attributes.getModInt();
		}
	}

	public int getIntimidationMod() {
		return intimidationMod;
	}

	public void setIntimidationMod(Skills skills, Attributes attributes) {
		if (skills.isIntimidation()) {
			this.intimidationMod = attributes.getModChar() + 2;
		} else {
			this.intimidationMod = attributes.getModChar();
		}
	}

	public int getInvestigationMod() {
		return investigationMod;
	}

	public void setInvestigationMod(Skills skills, Attributes attributes) {
		if (skills.isInvestigation()) {
			this.investigationMod = attributes.getModInt() + 2;
		} else {
			this.investigationMod = attributes.getModInt();
		}
	}

	public int getMedicineMod() {
		return medicineMod;
	}

	public void setMedicineMod(Skills skills, Attributes attributes) {
		if (skills.isMedicine()) {
			this.medicineMod = attributes.getModWis() + 2;
		} else {
			this.medicineMod = attributes.getModWis();
		}
	}

	public int getNatureMod() {
		return natureMod;
	}

	public void setNatureMod(Skills skills, Attributes attributes) {
		if (skills.isNature()) {
			this.natureMod = attributes.getModInt() + 2;
		} else {
			this.natureMod = attributes.getModInt();
		}
	}

	public int getPerceptionMod() {
		return perceptionMod;
	}

	public void setPerceptionMod(Skills skills, Attributes attributes) {
		if (skills.isPerception()) {
			this.perceptionMod = attributes.getModWis() + 2;
		} else {
			this.perceptionMod = attributes.getModWis();
		}
	}

	public int getPerformanceMod() {
		return performanceMod;
	}

	public void setPerformanceMod(Skills skills, Attributes attributes) {
		if (skills.isPerformance()) {
			this.performanceMod = attributes.getModChar() + 2;
		} else {
			this.performanceMod = attributes.getModChar();
		}
	}

	public int getPersuasionMod() {
		return persuasionMod;
	}

	public void setPersuasionMod(Skills skills, Attributes attributes) {
		if (skills.isPersuasion()) {
			this.persuasionMod = attributes.getModChar() + 2;
		} else {
			this.persuasionMod = attributes.getModChar();
		}
	}

	public int getReligionMod() {
		return religionMod;
	}

	public void setReligionMod(Skills skills, Attributes attributes) {
		if (skills.isReligion()) {
			this.religionMod = attributes.getModInt() + 2;
		} else {
			this.religionMod = attributes.getModInt();
		}
	}

	public int getSleightOfHandMod() {
		return sleightOfHandMod;
	}

	public void setSleightOfHandMod(Skills skills, Attributes attributes) {
		if (skills.isSleightOfHand()) {
			this.sleightOfHandMod = attributes.getModDex() + 2;
		} else {
			this.sleightOfHandMod = attributes.getModDex();
		}
	}

	public int getStealthMod() {
		return stealthMod;
	}

	public void setStealthMod(Skills skills, Attributes attributes) {
		if (skills.isStealth()) {
			this.stealthMod = attributes.getModDex() + 2;
		} else {
			this.stealthMod = attributes.getModDex();
		}
	}

	public int getSurvivalMod() {
		return survivalMod;
	}

	public void setSurvivalMod(Skills skills, Attributes attributes) {
		if (skills.isSurvival()) {
			this.survivalMod = attributes.getModWis() + 2;
		} else {
			this.survivalMod = attributes.getModWis();
		}
	}
    
    
}
