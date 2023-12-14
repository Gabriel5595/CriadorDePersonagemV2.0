package br.edu.infnet.CriadorDePersonagemV20;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.CriadorDePersonagemV20.model.domain.Weapon;
import br.edu.infnet.CriadorDePersonagemV20.model.service.WeaponService;

@Order(7)
@Component
public class WeaponLoader implements ApplicationRunner{
	@Autowired
	private WeaponService weaponService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
		FileReader file = new FileReader("files/weapon.txt");
		BufferedReader read = new BufferedReader(file);
		
		String line = read.readLine();
		String[] fields = null;
		
		while(line != null) {
			fields = line.split(";");

			Weapon weapon = new Weapon();
			weapon.setWeaponName(fields[0]);
			weapon.setWeaponType(fields[1]);
			weapon.setWeaponDice(fields[2]);
			weapon.setWeaponDamage(fields[3]);
			weapon.setMeleeOrDistance(fields[4]);
			
			weaponService.add(weapon);
			
			System.out.println(weapon);
			
			line = read.readLine();
		}
		
		read.close();
	}
}
