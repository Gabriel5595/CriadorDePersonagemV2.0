package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterRace;
import br.edu.infnet.CriadorDePersonagemV20.model.service.BasicCharService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.CharacterRaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Race")
public class CharacterRaceController {
    @Autowired
    CharacterRaceService characterRaceService;

    @GetMapping(value = "/pull")
    public List<CharacterRace> pullList() {
        return (List<CharacterRace>) characterRaceService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<CharacterRace> pull(@PathVariable Integer id){
        return characterRaceService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody CharacterRace characterRace){
        characterRaceService.add(characterRace);
    }
}
