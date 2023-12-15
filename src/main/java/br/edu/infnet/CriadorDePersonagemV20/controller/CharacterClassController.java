package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterClass;
import br.edu.infnet.CriadorDePersonagemV20.model.service.CharacterClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Class")
public class CharacterClassController {
    @Autowired
    CharacterClassService characterClassService;

    @GetMapping(value = "/pull")
    public List<CharacterClass> pullList() {
        return (List<CharacterClass>) characterClassService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<CharacterClass> pull(@PathVariable Integer id){
        return characterClassService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody CharacterClass characterClass){
        characterClassService.add(characterClass);
    }
}
