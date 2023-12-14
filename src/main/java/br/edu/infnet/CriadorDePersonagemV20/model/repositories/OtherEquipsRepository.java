package br.edu.infnet.CriadorDePersonagemV20.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.OtherEquips;

@Repository
public interface OtherEquipsRepository extends CrudRepository<OtherEquips, Integer>{

}
