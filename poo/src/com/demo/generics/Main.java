package com.demo.generics;

public class Main {

    public static void main(String[] args) {

        Caixa<String> caixaDeTexto = new Caixa<>();
        caixaDeTexto.guardar("Teste caixa");

        Caixa<Integer> caixaDeNumero = new Caixa<>();
        caixaDeNumero.guardar(77);

        System.out.println(caixaDeTexto.pegar());
        System.out.println(caixaDeNumero.pegar());

    }


}
