package com.demo.cafeteria;

public class Main {

    public static void main(String[] args) {

        DolceGusto dolceGusto = new DolceGusto();

        dolceGusto.ligar();
        dolceGusto.colocarCachimbo();

        dolceGusto.selecionarModo(ModoCafe.EXPRESSO);
        dolceGusto.fazerCafe();

        dolceGusto.selecionarModo(ModoCafe.PINGADO);
        dolceGusto.fazerCafe();
    }
}
