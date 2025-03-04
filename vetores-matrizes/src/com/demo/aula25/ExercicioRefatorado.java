package com.demo.aula25;

import java.util.Scanner;

public class ExercicioRefatorado {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] agenda = new String[5][8];

        System.out.println("# Google - Agenda semanal CLI #");

        for (int dia = 0; dia < 5; dia++) {

            String diaSemana = "";
            switch (dia) {
                case 0:
                    diaSemana = "Segunda";
                    break;
                case 1:
                    diaSemana = "Terça";
                    break;
                case 2:
                    diaSemana = "Quarta";
                    break;
                case 3:
                    diaSemana = "Quinta";
                    break;
                case 4:
                    diaSemana = "Sexta";
                    break;
            }

            System.out.println("Quer cadastrar tarefas para " + diaSemana + "?");

            String resposta = sc.nextLine();

            if(resposta.equalsIgnoreCase("sim")) {

                for (int tarefas = 0; tarefas < 8; tarefas++) {

                    System.out.println("Digite o nome da tarefa " + (tarefas + 1) + "/8 ou 'Finalizar': ");

                    String nomeTarefa = sc.nextLine();

                    if(nomeTarefa.equalsIgnoreCase("finalizar")) {
                        break;
                    } else {
                        agenda[dia][tarefas] = nomeTarefa;
                    }

                }

            }

        }

        System.out.println("Agenda finalizada!");
        System.out.println("Imprimindo...");

        for (int i = 0; i < 5; i++) {

            String diaSemana = "";
            switch (i) {
                case 0:
                    diaSemana = "Segunda";
                    break;
                case 1:
                    diaSemana = "Terça";
                    break;
                case 2:
                    diaSemana = "Quarta";
                    break;
                case 3:
                    diaSemana = "Quinta";
                    break;
                case 4:
                    diaSemana = "Sexta";
                    break;
            }

            System.out.println("Agenda de " + diaSemana);

            for (int j = 0; j < 8; j++) {

                if(agenda[i][j] != null) {
                    System.out.println("- " + agenda[i][j]);
                }

            }

        }

    }
}
