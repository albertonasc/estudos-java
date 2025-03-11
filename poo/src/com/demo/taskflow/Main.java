package com.demo.taskflow;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GerenciadorTarefas gerenciadorTarefas = new GerenciadorTarefas();

        System.out.println("Bem vindo ao TaskFlow!");

        boolean finalizarTaskFlow = false;
        do {
            printMenu();

            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    adicionarTarefa(sc, gerenciadorTarefas);
                    break;
                case 2:
                    removerTarefaPorId(sc, gerenciadorTarefas);
                    break;
                case 3:
                    gerenciadorTarefas.imprimirTarefas();
                    break;
                case 4:
                    finalizarTarefa(sc, gerenciadorTarefas);
                    break;
                case 5:
                    procurarTarefa(sc, gerenciadorTarefas);
                    break;
                case 6:
                    finalizarTaskFlow = true;
                    break;
            }

        } while (!finalizarTaskFlow);

    }

    private static void procurarTarefa(Scanner sc, GerenciadorTarefas gerenciadorTarefas) {
        System.out.println("Digite a descrição:");
        String descricao = sc.nextLine();
        gerenciadorTarefas.procurarTarefa(descricao);
    }

    private static void finalizarTarefa(Scanner sc, GerenciadorTarefas gerenciadorTarefas) {
        System.out.println("Digite o ID:");
        String id = sc.nextLine();
        gerenciadorTarefas.finalizarTarefa(id);
    }

    private static void removerTarefaPorId(Scanner sc, GerenciadorTarefas gerenciadorTarefas) {
        System.out.println("Digite o  ID da tarefa:");
        String id = sc.nextLine();
        gerenciadorTarefas.removerTarefa(id);
    }

    private static void adicionarTarefa(Scanner sc, GerenciadorTarefas gerenciadorTarefas) {
        System.out.println("Digite o ID da tarefa:");
        String id = sc.nextLine();
        System.out.println("Digite a descrição da tarefa:");
        String descricao = sc.nextLine();
        gerenciadorTarefas.adicionarTarefa(id, descricao);
    }

    private static void printMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Adicionar tarefa");
        System.out.println("2 - Remover tarefa");
        System.out.println("3 - Listar tarefas");
        System.out.println("4 - Marcar tarefa como concluida");
        System.out.println("5 - Procurar tarefa");
        System.out.println("6 - Sair");
    }
}
