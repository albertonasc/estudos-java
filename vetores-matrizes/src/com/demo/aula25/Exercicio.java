package com.demo.aula25;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {

        // agendamento para os 5 dias de trabalho da semana, cada dia no máximo 8 tarefas
        // cadastrar tarefas para cada dia, se sim realizar cadastro
        Scanner sc = new Scanner(System.in);

        String[] diasSemana = new String[] {"Segunda", "Terça", "Quarta", "Quinta", "Sexta"};
        String[][] tarefas = new String[5][8];
        String resposta = "";

        System.out.println("# Google - Agenda semanal CLI #");

        for (int contador = 0; contador < diasSemana.length; contador++) {

            int indiceDiaSemana = contador;

            System.out.println("Quer cadastrar tarefas para " + diasSemana[contador] + "?");
            resposta = sc.nextLine();

            if(resposta.equalsIgnoreCase("Sim")) {

                for (int i = 0; i < 8; i++) {

                    System.out.println("Digite a tarefa " + (i + 1) + "/8 ou 'Finalizar'");
                    resposta = sc.nextLine();

                    if(resposta.equalsIgnoreCase("Finalizar")) {
                        break;
                    } else {
                        // Adicionar tarefas
                        tarefas[indiceDiaSemana][i] = resposta;
                    }

                }
            }

        }

        System.out.println("Agenda finalizada!");
        System.out.println("Imprimindo...");

        // Mostar tarefas de cada dia da semana
        for (int c = 0; c < diasSemana.length; c++) {

            int indiceDiaSemana = c;

            System.out.println(diasSemana[c].toUpperCase() + ":");

            for(int i = 0; i < 5; i++) {

                if(i == indiceDiaSemana) {

                    for (int j = 0; j < 8; j++) {

                        String tarefasDia = tarefas[i][j];

                        if(tarefasDia != null) {
                            System.out.println("- " + tarefasDia);
                        }
                    }
                }

            }

        }

    }
}
