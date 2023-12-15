package br.edu.infnet.CriadorDePersonagemV20.model.service;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.Optional;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Skills;
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

    public Optional<Weapon> pull(Integer id){
        Optional<Weapon> weaponPulled = weaponRepository.findById(id);
        return weaponPulled;
    }
	
}
