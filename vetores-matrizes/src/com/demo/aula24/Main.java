package com.demo.aula24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Quantas notas você vai cadastrar? ");

        Scanner sc = new Scanner(System.in);
        int quantidadeNotas = sc.nextInt();
        sc.nextLine();
        int[] notas =  new int[quantidadeNotas];


        for (int contador = 0; contador < quantidadeNotas; contador++) {

            System.out.println("Digite o valor da nota " + (contador+1) + ":");
            notas[contador] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("Imprimindo os valores das notas: ");
        for(int item : notas) {
            System.out.println(item);
        }

    }
}
