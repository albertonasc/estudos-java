package com.demo.aula21;

import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("## jira CLI ##");

        int opcao;

        do {
            System.out.println("1 - Criar tarefa");
            System.out.println("2 - Criar projeto");
            System.out.println("3 - Sair");
            System.out.print("Digite uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            if(opcao == 1) {
                System.out.print("Digite o nome da tarefa: ");
                String nomeTarefa = sc.nextLine();
                System.out.println("Tarefa [" + nomeTarefa +  "] criada com sucesso!");
            }

            if(opcao == 2) {
                System.out.print("Digite o nome do projeto: ");
                String nomeProjeto = sc.nextLine();
                System.out.println("Projeto [" + nomeProjeto +  "] criado com sucesso!");
            }

            if(opcao > 3) {
                System.out.println("Opção inválida!");
            }

        } while(opcao != 3);

        System.out.println("Sistema finalizado!");
    }
}
