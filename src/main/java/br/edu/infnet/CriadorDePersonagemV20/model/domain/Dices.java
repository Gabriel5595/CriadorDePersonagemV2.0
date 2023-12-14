package br.edu.infnet.CriadorDePersonagemV20.model.domain;

import java.util.Random;

public class Dices {
	private static Random random = new Random();

    // Método para rolar dado de 4 lados
    public static int rollD4() {
        return rollDices(4);
    }

    // Método para rolar dado de 6 lados
    public static int rollD6() {
        return rollDices(6);
    }

    // Método para rolar dado de 8 lados
    public static int rollD8() {
        return rollDices(8);
    }

    // Método para rolar dado de 10 lados
    public static int rollD10() {
        return rollDices(10);
    }

    // Método para rolar dado de 12 lados
    public static int rollD12() {
        return rollDices(12);
    }

    // Método para rolar dado de 20 lados
    public static int rollD20() {
        return rollDices(20);
    }

    // Métodos para rolar dados de 100 lados
    public static int rollD100() {
        return rollDices(20);
    }

    // Método genérico para rolar dados de n lados
    private static int rollDices(int sides) {
        return random.nextInt(sides) + 1;
    }
}
