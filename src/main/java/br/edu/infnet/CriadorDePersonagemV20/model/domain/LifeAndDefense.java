package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TLife_And_Defense")
public class LifeAndDefense {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    public int life;
    public int armorClass;
    
	public LifeAndDefense() {}
    
    public LifeAndDefense(Integer id) {
		this.id = id;
	}
    
    public void calculateLifeAndDefense(CharacterClass characterClass, Armor armor, Attributes attributes) {
    	setLife(characterClass, attributes);
    	setArmorClass(armor, attributes);
    	
    }
    
	@Override
	public String toString() {
		return "LifeAndDefense [id=" + id + ", life=" + life + ", armorClass=" + armorClass + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getLife() {
		return life;
	}

	public void setLife(CharacterClass characterClass, Attributes attributes) {
		String lifeDice = characterClass.getLifeDice();
		switch (lifeDice) {
		    case "1d4": this.life = Dices.rollD4() + attributes.getModConst();
		    case "1d6": this.life = Dices.rollD6() + attributes.getModConst();
		    case "1d8": this.life = Dices.rollD8() + attributes.getModConst();
		    case "1d10": this.life = Dices.rollD10() + attributes.getModConst();
		    case "1d12": this.life = Dices.rollD12() + attributes.getModConst();
		    case "1d20": this.life = Dices.rollD20() + attributes.getModConst();
		}
	}

	public int getArmorClass() {
		return armorClass;
	}

	public void setArmorClass(Armor armor, Attributes attributes) {
		String armorType = armor.getArmorType();
        int defense = armor.getDefense();
        int modDex = attributes.getModDex();
        if (armorType.equals("Pesada")) {
            this.armorClass = defense;
        } else if (armorType.equals("Média")) {
            if (modDex > 2) {
                this.armorClass = defense + 2;
            } else {
                this.armorClass = defense + modDex;
            }
        } else {
            this.armorClass = defense + modDex;
        }
	} 
}
