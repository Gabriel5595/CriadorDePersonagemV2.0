package br.edu.infnet.CriadorDePersonagemV20.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Armor;

@Repository
public interface ArmorRepository extends CrudRepository<Armor, Integer>{
}
