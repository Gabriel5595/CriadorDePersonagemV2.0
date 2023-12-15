package br.edu.infnet.CriadorDePersonagemV20.controller;


import br.edu.infnet.CriadorDePersonagemV20.model.domain.BasicChar;
import br.edu.infnet.CriadorDePersonagemV20.model.domain.CharacterClass;
import br.edu.infnet.CriadorDePersonagemV20.model.service.BasicCharService;
import br.edu.infnet.CriadorDePersonagemV20.model.service.CharacterClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Basic")
public class BasicCharController {
    @Autowired
    BasicCharService basicCharService;

    @GetMapping(value = "/pull")
    public List<BasicChar> pullList() {
        return (List<BasicChar>) basicCharService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<BasicChar> pull(@PathVariable Integer id){
        return basicCharService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody BasicChar basicChar){
        basicCharService.add(basicChar);
    }
}
