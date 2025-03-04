package com.demo.aula21;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        do {
//            System.out.println("Executou");
//        } while (false);

        Scanner sc = new Scanner(System.in);

        String resposta = "";

        do {
            System.out.print("Qual a cor do sinal? ");
            resposta = sc.nextLine();
            System.out.println("Carros estão passando!");
        } while (resposta.equalsIgnoreCase("verde"));

        System.out.println("Hora de parar!");
    }
}
