package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Weapon")
public class Weapon {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    public String weaponName;
    public String weaponType;
    public String weaponDice;
    public String weaponDamage;
    public String meleeOrDistance;
    
    public Weapon() {}
    
    public Weapon(Integer id) {
		this.id = id;
	}
    
    public Weapon(String weaponName, String weaponType, String weaponDice, String weaponDamage, String meleeOrDistance) {
    	this.weaponName = weaponName;
    	this.weaponType = weaponType;
    	this.weaponDice = weaponDice;
    	this.weaponDamage = weaponDamage;
    	this.meleeOrDistance = meleeOrDistance;
    }
	
	@Override
	public String toString() {
		return "Weapon [id=" + id + ", weaponName=" + weaponName + ", weaponType=" + weaponType + ", weaponDice="
				+ weaponDice + ", weaponDamage=" + weaponDamage + ", meleeOrDistance=" + meleeOrDistance + "]";
	}

	public String getWeaponName() {
		return weaponName;
	}



	public void setWeaponName(String weaponName) {
		this.weaponName = weaponName;
	}



	public String getWeaponType() {
		return weaponType;
	}



	public void setWeaponType(String weaponType) {
		this.weaponType = weaponType;
	}



	public String getWeaponDice() {
		return weaponDice;
	}



	public void setWeaponDice(String weaponDice) {
		this.weaponDice = weaponDice;
	}



	public String getWeaponDamage() {
		return weaponDamage;
	}



	public void setWeaponDamage(String weaponDamage) {
		this.weaponDamage = weaponDamage;
	}



	public String getMeleeOrDistance() {
		return meleeOrDistance;
	}



	public void setMeleeOrDistance(String meleeOrDistance) {
		this.meleeOrDistance = meleeOrDistance;
	}

}
