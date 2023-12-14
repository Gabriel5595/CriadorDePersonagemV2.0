package br.edu.infnet.CriadorDePersonagemV20.model.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.Weapon;

@Repository
public interface WeaponRepository extends CrudRepository<Weapon, Integer>{
	
}
