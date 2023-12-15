package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.LifeAndDefense;
import br.edu.infnet.CriadorDePersonagemV20.model.service.BasicCharService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.LifeAndDefenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Life")
public class LifeAndDefenseController {
    @Autowired
    LifeAndDefenseService lifeAndDefenseService;

    @GetMapping(value = "/pull")
    public List<LifeAndDefense> pullList() {
        return (List<LifeAndDefense>) lifeAndDefenseService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<LifeAndDefense> pull(@PathVariable Integer id){
        return lifeAndDefenseService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody LifeAndDefense lifeAndDefense){
        lifeAndDefenseService.add(lifeAndDefense);
    }
}
