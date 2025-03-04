package com.demo.aula20;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("### MONTANHA RUSSA DA DISNEY");
        System.out.println("Sistema inicializado com sucesso");
        System.out.println("Para sair digite 'finalizar'");
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Qual a altura do passageiro em cm? ");
            String altura = sc.next();
            if(altura.equals("finalizar")) {
                break;
            }

            int alturaCm = Integer.parseInt(altura);
            if(alturaCm > 160) {
                System.out.println("Viagem liberada");
            } else {
                System.out.println("Viagem negada");
            }
        }

        System.out.println("Sistema finalizado com sucesso!");
    }

}