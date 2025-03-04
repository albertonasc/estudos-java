package com.demo.aula23;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        String[] nomes = {"Andy Hug", "Francisco Filho", "Glaube Feitosa", "Beto Nascimento"};
//        String[] alfabeto = new String[3];
//
//        System.out.println(nomes);
//        System.out.println(alfabeto[1]);//em java valores nao inicializados são null
//
//        System.out.println(Arrays.toString(nomes));

        System.out.println("# Lista de Tarefas #");
        System.out.println("Quantas tarefas você quer cadastar?");

        Scanner sc = new Scanner(System.in);
        int quantidadeTarefas = sc.nextInt();
        sc.nextLine();

        String[] tarefas = new String[quantidadeTarefas];

        for(int contador = 0; contador < quantidadeTarefas; contador++) {
            System.out.println("Digite a tarefa " + (contador + 1) + ":");

            tarefas[contador] = sc.nextLine();
        }

        System.out.println("Sua lista de tarefas cadastradas é:");
        System.out.println(Arrays.toString(tarefas));

    }
}
