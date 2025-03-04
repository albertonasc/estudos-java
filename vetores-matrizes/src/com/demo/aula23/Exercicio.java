package com.demo.aula23;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        System.out.println("## Gestão de inventários ##");

        System.out.println("1 - Adicionar item");
        System.out.println("2 - Remover item");
        System.out.println("3 - Sair");

        Scanner sc = new Scanner(System.in);

        int opcao = 0;
        String[] inventario = {"", "", ""};

        do {
            System.out.println("--------------------------");
            System.out.println("Seu inventario: " + Arrays.toString(inventario));

            System.out.println("O que você quer fazer?");
            opcao = sc.nextInt();
            sc.nextLine();

            int slot;

            switch (opcao) {
                case 1:
                    System.out.println("Onde você quer guardar o (indice)? ");
                    slot = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Qual o nome do item? ");
                    inventario[slot] = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Qual você vai remover? ");
                    slot = sc.nextInt();
                    sc.nextLine();
                    inventario[slot] = "";
                    break;
                case 3:
                    System.out.println("Saindo do inventário...");
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }while (opcao != 3);

    }
}
