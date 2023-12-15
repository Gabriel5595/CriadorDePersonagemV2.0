package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Attributes;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;
import br.edu.infnet.CriadorDePersonagemV20.model.service.AttributesService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.BasicCharService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Attributes")
public class AttributesController {
    @Autowired
    AttributesService attributesService;

    @GetMapping(value = "/pull")
    public List<Attributes> pullList() {
        return (List<Attributes>) attributesService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<Attributes> pull(@PathVariable Integer id){
        return attributesService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody Attributes attributes){
        attributesService.add(attributes);
    }
}
