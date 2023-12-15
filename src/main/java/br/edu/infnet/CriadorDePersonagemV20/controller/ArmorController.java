package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Armor;
import br.edu.infnet.CriadorDePersonagemV20.model.service.ArmorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Armor")
public class ArmorController {
    @Autowired
    ArmorService armorService;

    @GetMapping(value = "/pull")
    public List<Armor> pullList() {
        return (List<Armor>) armorService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<Armor> pull(@PathVariable Integer id){
        return armorService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody Armor armor){
        armorService.add(armor);
    }
}
