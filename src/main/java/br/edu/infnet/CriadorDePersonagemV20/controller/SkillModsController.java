package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.SkillMods;
import br.edu.infnet.CriadorDePersonagemV20.model.service.SkillModsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/SkillMods")
public class SkillModsController {
    @Autowired
    SkillModsService skillModsService;

    @GetMapping(value = "/pull")
    public List<SkillMods> pullList() {
        return (List<SkillMods>) skillModsService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<SkillMods> pull(@PathVariable Integer id){
        return skillModsService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody SkillMods skillMods){
        skillModsService.add(skillMods);
    }
}
