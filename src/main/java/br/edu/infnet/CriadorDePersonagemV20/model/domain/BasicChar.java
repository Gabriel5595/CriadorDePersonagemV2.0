package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TPersonagemBasico")
public class BasicChar {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nomeJogador;
	private String nomePersonagem;
	private int level;
	
	@Override
	public String toString() {
		return "\nDados Básicos do Personagem\n" +
				"Nome do Jogador: "+ getNomeJogador() + "\n" +
				"Nome do Personagem: " + getNomePersonagem() + "\n" +
				"Nível: " + getLevel() + ".\n";
	}
	
	public BasicChar() {}
	
	public BasicChar(Integer id) {
		this.id = id;
	}
	
	public BasicChar (String nomeJogador, String nomePersonagem, int level) {
		this.nomeJogador = nomeJogador;
		this.nomePersonagem = nomePersonagem;
		this.level = level;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeJogador() {
		return nomeJogador;
	}

	public void setNomeJogador(String nomeJogador) {
		this.nomeJogador = nomeJogador;
	}

	public String getNomePersonagem() {
		return nomePersonagem;
	}

	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}
	
	
	
}
