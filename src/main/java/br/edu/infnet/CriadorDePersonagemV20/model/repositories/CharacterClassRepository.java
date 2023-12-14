package br.edu.infnet.CriadorDePersonagemV20.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterClass;

@Repository
public interface CharacterClassRepository extends CrudRepository<CharacterClass, Integer>{

}
