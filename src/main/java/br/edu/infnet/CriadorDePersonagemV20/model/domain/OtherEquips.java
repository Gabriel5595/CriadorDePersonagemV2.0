package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "OtherEquipsController")
public class OtherEquips {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String equipName;
	private int amount;
	
	public OtherEquips() {}
	
	public OtherEquips(Integer id) {
		this.id = id;
	}

	public OtherEquips(Integer id, String equipName, int amount) {
		this.equipName = equipName;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "OtherEquipsController [id=" + id + ", equipName=" + equipName + ", amount=" + amount + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEquipName() {
		return equipName;
	}

	public void setEquipName(String equipName) {
		this.equipName = equipName;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
}
