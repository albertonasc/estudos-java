package com.demo.aula25;

import java.util.Scanner;

public class MapaTesouro {

    public static void main(String[] args) {

        System.out.println("------Mapa do Tesouro------");
        System.out.println(" -  0  1  2  ");
        System.out.println(" 0  *  *  *  ");
        System.out.println(" 1  *  *  *  ");
        System.out.println(" 2  *  *  *  ");

        boolean[][] mapaTesouro = new boolean[3][3];

        mapaTesouro[1][2] = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Onde esta o tesouro? Digite a linha ");
        int x = sc.nextInt();
        sc.nextLine();

        System.out.println("Onde esta o tesouro? Digite a coluna ");
        int y = sc.nextInt();
        sc.nextLine();

        System.out.println("Procurando...");

        if(mapaTesouro[x][y]) {
            System.out.println("Achou o tesouro!");
        } else {
            System.out.println("Você não achou nada!");
        }

    }
}
