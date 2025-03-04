package com.demo.aula22;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("## Desempenhos - Oracle **");
        System.out.print("Qual a quantidade de menbros do time? ");
        int quantidadeMenbros = sc.nextInt();
        double somatorioNotas = 0;

        for (int contador = 1; contador <= quantidadeMenbros; contador++) {
            System.out.println("Digite a nota do menbro " + contador + ":");
            somatorioNotas += sc.nextInt();
        }

        System.out.println("Pesquisa Finalizada!");
        System.out.println("Gerando a média do time...");
        System.out.println("O desemprenho do time é: " + (somatorioNotas / quantidadeMenbros));
    }
}
