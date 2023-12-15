package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Attributes")
public class Attributes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
    private int stregth;
    private int modStr;
    private int dexterity;
    private int modDex;
    private int constitution;
    private int modConst;
    private int intelligence;
    private int modInt;
    private int wisdom;
    private int modWis;
    private int charisma;
    private int modChar;
    @OneToOne(cascade = CascadeType.DETACH)
    @JoinColumn(name = "idBasic_Char")
    private BasicChar basicChar;
    
    public Attributes() {}
	
	public Attributes(Integer id) {
		this.id = id;
	}
	
	public void addAttributeMods() {
        this.modStr = calculateMod(getStregth());
        this.modDex = calculateMod(getDexterity());
        this.modConst = calculateMod(getConstitution());
        this.modInt = calculateMod(getIntelligence());
        this.modWis = calculateMod(getWisdom());
        this.modChar = calculateMod(getCharisma());
    }
	
	@Override
	public String toString() {
		return "Attributes [id=" + id + ", stregth=" + stregth + ", modStr=" + modStr + ", dexterity=" + dexterity
				+ ", modDex=" + modDex + ", constitution=" + constitution + ", modConst=" + modConst + ", intelligence="
				+ intelligence + ", modInt=" + modInt + ", wisdom=" + wisdom + ", modWis=" + modWis + ", charisma="
				+ charisma + ", modChar=" + modChar + ", BasicChar=" + basicChar + "]";
	}

	private int calculateMod(int attributeValue) {
        int modCalculado = 0;
        if (attributeValue == 1) {
            modCalculado = -5;
        } else if (attributeValue == 2 || attributeValue == 3) {
            modCalculado = -4;
        } else if (attributeValue == 4 || attributeValue == 5) {
            modCalculado = -3;
        }  else if (attributeValue == 6 || attributeValue == 7) {
            modCalculado = -2;
        } else if (attributeValue == 8 || attributeValue == 9) {
            modCalculado = -1;
        } else if (attributeValue == 12 || attributeValue == 13) {
            modCalculado = 1;
        } else if (attributeValue == 14 || attributeValue == 15) {
            modCalculado = 2;
        } else if (attributeValue == 16 || attributeValue == 17) {
            modCalculado = 3;
        } else if (attributeValue == 18 || attributeValue == 19) {
            modCalculado = 4;
        } else if (attributeValue == 20 || attributeValue == 21) {
            modCalculado = 5;
        } else if (attributeValue == 22 || attributeValue == 23) {
            modCalculado = 6;
        } else if (attributeValue == 24 || attributeValue == 25) {
            modCalculado = 7;
        } else if (attributeValue == 26 || attributeValue == 27) {
            modCalculado = 8;
        } else if (attributeValue == 28 || attributeValue == 29) {
            modCalculado = 9;
        } else if (attributeValue == 30) {
            modCalculado = 10;
        }
        return modCalculado;
    }
	
	public static List<Integer> drawAttributes() {
        List<Integer> fullDrawList = new ArrayList<>();
        for(int i = 0; i <= 5; i++) {
            List<Integer> rolledDices = new ArrayList<>();
            for(int x = 0; x <= 3; x++){
            	rolledDices.add(Dices.rollD6());
            }
            System.out.println("Sequencia de rolagens " + (i+1) + " foi: " + rolledDices + ".");
            rolledDices.sort(Collections.reverseOrder());
            System.out.println("A nova ordem da sequencia é " + rolledDices + ".");
            System.out.println("O número " + rolledDices.get(3) + " será removido.");
            rolledDices.remove(3);
            int resultsSum = 0;
            int y = 0;
            do {
                resultsSum += rolledDices.get(y);
                y++;
            } while (y < rolledDices.size());
            System.out.println("A soma dos resultados da rolage " + (i+1) + " foi de " + resultsSum + ".\n");
            fullDrawList.add(resultsSum);
        }
        System.out.println("A lista de resultados é: " + fullDrawList + ".");
        return fullDrawList;
    }

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getStregth() {
		return stregth;
	}

	public void setStregth(int stregth) {
		this.stregth = stregth;
	}

	public int getModStr() {
		return modStr;
	}

	public void setModStr(int modStr) {
		this.modStr = modStr;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getModDex() {
		return modDex;
	}

	public void setModDex(int modDex) {
		this.modDex = modDex;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getModConst() {
		return modConst;
	}

	public void setModConst(int modConst) {
		this.modConst = modConst;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getModInt() {
		return modInt;
	}

	public void setModInt(int modInt) {
		this.modInt = modInt;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getModWis() {
		return modWis;
	}

	public void setModWis(int modWis) {
		this.modWis = modWis;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public int getModChar() {
		return modChar;
	}

	public void setModChar(int modChar) {
		this.modChar = modChar;
	}

	public BasicChar getBasicChar() {
		return basicChar;
	}

	public void setBasicChar(BasicChar basicChar) {
		this.basicChar = basicChar;
	}  
    
}
