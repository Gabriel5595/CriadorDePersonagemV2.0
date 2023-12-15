package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.SkillMods;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.Skills;
import br.edu.infnet.CriadorDePersonagemV20.model.service.SkillModsService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.SkillsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Skills")
public class SkillsController {
    @Autowired
    SkillsService skillsService;

    @GetMapping(value = "/pull")
    public List<Skills> pullList() {
        return (List<Skills>) skillsService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<Skills> pull(@PathVariable Integer id){
        return skillsService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody Skills skills){
        skillsService.add(skills);
    }
}
