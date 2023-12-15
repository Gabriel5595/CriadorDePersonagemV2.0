package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBasicChar")
public class BasicChar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String playerName;
	private String characterName;
	private int level;
	
	
	
	@Override
	public String toString() {
		return "BasicChar [id=" + id + ", playerName=" + playerName + ", characterName=" + characterName
				+ ", level=" + level + "]";
	}

	public BasicChar() {}
	
	public BasicChar(Integer id) {
		this.id = id;
	}
	
	public BasicChar (String playerName, String characterName, int level) {
		this.playerName = playerName;
		this.characterName = characterName;
		this.level = level;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeJogador() {
		return playerName;
	}

	public void setNomeJogador(String nomeJogador) {
		this.playerName = nomeJogador;
	}

	public String getNomePersonagem() {
		return characterName;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.characterName = nomePersonagem;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
