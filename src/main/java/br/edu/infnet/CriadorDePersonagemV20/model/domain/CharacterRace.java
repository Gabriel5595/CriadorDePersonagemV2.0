package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "TRace")
public class CharacterRace {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@JsonProperty("Nome")
    private String raceName;
    @JsonProperty("Tamanho")
    private String size;
    @JsonProperty("Deslocamento")
    private String displacement;
    
    public CharacterRace() {}
    
    public CharacterRace(Integer id) {
		this.id = id;
	}

	public CharacterRace(String raceName, String size, String displacement) {
		this.raceName = raceName;
		this.size = size;
		this.displacement = displacement;
	}
	
	@Override
	public String toString() {
		return "CharacterRace [id=" + id + ", raceName=" + raceName + ", size=" + size + ", displacement="
				+ displacement + "]";
	}

	public String getRaceName() {
		return raceName;
	}

	public void setRaceName(String raceName) {
		this.raceName = raceName;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getDisplacement() {
		return displacement;
	}

	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
    
    
}
