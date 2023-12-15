package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Armor")
public class Armor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    public String armorName;
    public String armorType;
    public int defense;
    public int strengthRequired;
    public boolean stealthDisadvantage;
	
    public Armor() {}
    
    public Armor(Integer id) {
		this.id = id;
	}
    
    public Armor(String armorName, String armorType, int defence, int strengthRequired, boolean stealthDisadvantage) {
		super();
		this.armorName = armorName;
		this.armorType = armorType;
		this.defense = defence;
		this.strengthRequired = strengthRequired;
		this.stealthDisadvantage = stealthDisadvantage;
	}
    
	@Override
	public String toString() {
		return "Armor [id=" + id + ", armorName=" + armorName + ", armorType=" + armorType + ", defence=" + defense
				+ ", strengthRequired=" + strengthRequired + ", stealthDisadvantage=" + stealthDisadvantage + "]";
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getArmorName() {
		return armorName;
	}
	public void setArmorName(String armorName) {
		this.armorName = armorName;
	}
	public String getArmorType() {
		return armorType;
	}
	public void setArmorType(String armorType) {
		this.armorType = armorType;
	}
	public int getDefense() {
		return defense;
	}
	public void setDefense(int defence) {
		this.defense = defence;
	}
	public int getStrengthRequired() {
		return strengthRequired;
	}
	public void setStrengthRequired(int strengthRequired) {
		this.strengthRequired = strengthRequired;
	}
	public boolean isStealthDisadvantage() {
		return stealthDisadvantage;
	}
	public void setStealthDisadvantage(boolean stealthDisadvantage) {
		this.stealthDisadvantage = stealthDisadvantage;
	}
    
    
}
