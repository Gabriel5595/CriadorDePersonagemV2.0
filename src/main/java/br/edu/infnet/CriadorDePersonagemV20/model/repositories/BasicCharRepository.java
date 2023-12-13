package br.edu.infnet.CriadorDePersonagemV20.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;

@Repository
public interface BasicCharRepository extends CrudRepository<BasicChar, Integer>{

}
