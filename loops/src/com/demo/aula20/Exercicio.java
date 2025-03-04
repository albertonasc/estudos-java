package com.demo.aula20;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        System.out.println("### MONTANHA RUSSA DA DISNEY");
        System.out.println("Sistema inicializado com sucesso");
        System.out.println("Para sair digite 'finalizar'");

        Scanner sc = new Scanner(System.in);
        String resposta = "";

        while (!resposta.equalsIgnoreCase("finalizar")) {
            System.out.print("Qual a altura do passageiro em cm? ");
            resposta = sc.nextLine();

            if (!resposta.equalsIgnoreCase("finalizar")) {
                int altura = Integer.parseInt(resposta);
                if(altura > 160) {
                    System.out.println("Viagem liberada");
                } else {
                    System.out.println("Viagem negada");
                }
            }
        }

        System.out.println("Sistema finalizado com sucesso!");
    }
}
