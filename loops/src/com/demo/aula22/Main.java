package com.demo.aula22;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("# Sistema de Tabuada");

        System.out.print("Digite um numero: ");
        int numero = sc.nextInt();

        for(int contador = 1; contador <= 10; contador++) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
        }

    }
}
