package com.demo.aula25;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // tipoDado[][] nomeVariavel = { {valor, valor, valor}, {valor, valor, valor}, (valor, valor, valor)  };
        // tipoDado[][] nomeVariavel = new tipoDado[tamanhoLinha][tamanhoColuna];

        String[][] alfabeto = new String[3][3];

        alfabeto[0][0] = "A";
        alfabeto[0][1] = "B";
        alfabeto[0][2] = "C";

        alfabeto[1][0] = "D";
        alfabeto[1][1] = "E";
        alfabeto[1][2] = "F";

        alfabeto[2][0] = "G";
        alfabeto[2][1] = "H";
        alfabeto[2][2] = "I";

        for(int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.println(alfabeto[i][j]);

            }
        }

    }
}
