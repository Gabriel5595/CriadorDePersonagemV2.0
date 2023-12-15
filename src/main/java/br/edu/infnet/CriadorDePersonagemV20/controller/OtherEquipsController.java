package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.OtherEquips;
import br.edu.infnet.CriadorDePersonagemV20.model.service.OtherEquipsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Equips")
public class OtherEquipsController {
    @Autowired
    OtherEquipsService OtherEquipsService;

    @GetMapping(value = "/pull")
    public List<OtherEquips> pullList() {
        return (List<OtherEquips>) OtherEquipsService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<OtherEquips> pull(@PathVariable Integer id){
        return OtherEquipsService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody OtherEquips otherEquips){
        OtherEquipsService.add(otherEquips);
    }
}
