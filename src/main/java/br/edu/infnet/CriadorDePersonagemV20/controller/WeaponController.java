package br.edu.infnet.CriadorDePersonagemV20.controller;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Weapon;
import br.edu.infnet.CriadorDePersonagemV20.model.service.WeaponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Weapon")
public class WeaponController {
    @Autowired
    WeaponService weaponService;

    @GetMapping(value = "/pull")
    public List<Weapon> pullList() {
        return (List<Weapon>) weaponService.pullList();
    }

    @GetMapping(value = "/{id}/pull")
    public Optional<Weapon> pull(@PathVariable Integer id){
        return weaponService.pull(id);
    }

    @PostMapping(value = "/include")
    public void add(@RequestBody Weapon weapon){
        weaponService.add(weapon);
    }
}
