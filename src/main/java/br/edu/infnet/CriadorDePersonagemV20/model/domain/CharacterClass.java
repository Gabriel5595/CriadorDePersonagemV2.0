package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Class")
public class CharacterClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

    private String className;
    private String lifeDice;
	
    public CharacterClass() {}
    
    public CharacterClass(Integer id) {
		this.id = id;
	}

	public CharacterClass(String className, String lifeDice) {
		this.className = className;
		this.lifeDice = lifeDice;
	}

	@Override
	public String toString() {
		return "CharacterClass{" +
				"id=" + id +
				", className='" + className + '\'' +
				", lifeDice='" + lifeDice + '\'' +
				'}';
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public String getLifeDice() {
		return lifeDice;
	}
	public void setLifeDice(String lifeDice) {
		this.lifeDice = lifeDice;
	}

}
