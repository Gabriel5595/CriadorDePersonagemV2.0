package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Weapon;
import br.edu.infnet.CriadorDePersonagemV20.model.repositories.WeaponRepository;

@Service
public class WeaponService {
	@Autowired
	private WeaponRepository weaponRepository;
	
	public void add(Weapon weapon) {
		weaponRepository.save(weapon);
	}
	
	public Collection<Weapon> pullList(){
		return (Collection<Weapon>) weaponRepository.findAll();
	}
	
	public Weapon readJson(String weaponName) throws IOException {
        String path ="./files/arma/Arma_"+weaponName+".json";
        File jsonFile = new File(path);

        if (!jsonFile.exists()){
            System.out.println("Arquivo não pode ser encontrado\n");
        } else {
            System.out.println("Arquivo encontrado com sucesso!\n");
        }

        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonFile, Weapon.class);
    }
	
}
