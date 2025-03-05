package com.demo.sistemabancario;

public class Main {

    public static void main(String[] args) {

        ContaCorrente contaWalter = new ContaCorrente("111.222.333-44", "Walter Mercado");
        ContaCorrente contaMaria = new ContaCorrente("999.888.777-00", "Maria do Bairro");

        contaWalter.depositar(500);
        contaMaria.depositar(700);

        contaWalter.verSaldo();
        contaMaria.verSaldo();

        contaMaria.sacar(300);

        contaWalter.transferir(100, contaMaria);

        contaWalter.verSaldo();
        contaMaria.verSaldo();

    }
}
