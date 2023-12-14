package br.edu.infnet.CriadorDePersonagemV20.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Attributes;

@Repository
public interface AttributesRepository extends CrudRepository<Attributes, Integer>{

}
