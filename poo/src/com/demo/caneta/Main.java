package com.demo.caneta;

public class Main {
    public static void main(String[] args) {

        Caneta canetaAzul = new Caneta();
        canetaAzul.cor = "Azul";
        canetaAzul.carga = 100;
        canetaAzul.marca = "BIC";
        canetaAzul.ponta = 0.5;
        canetaAzul.tampar();

        canetaAzul.escrever("Texto escrito com a caneta azul!");

        canetaAzul.status();
    }
}