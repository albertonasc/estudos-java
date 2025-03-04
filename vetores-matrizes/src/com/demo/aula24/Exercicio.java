package com.demo.aula24;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        System.out.println("/-- Todo List CLI - By Micrisoft --/");
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas tarefas você vai criar? ");
        int totalTarefas = sc.nextInt();
        sc.nextLine();
        String[] tarefas = new String[totalTarefas];

        for (int contador = 0; contador < totalTarefas; contador++) {

            System.out.println("Digite a tarefa " + (contador+1));
            tarefas[contador] = (contador+1) + " - " + sc.nextLine();
        }

        System.out.println("Cadastro encerrado");
        System.out.println("Hoje vai fazer as tarefas:");

        for(String tarefa : tarefas) {
            System.out.println(tarefa);
        }

    }
}
