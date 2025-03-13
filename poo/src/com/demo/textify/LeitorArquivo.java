package com.demo.textify;

import java.io.*;

public class LeitorArquivo {

    public static String lerArquivo(String caminho) {

        StringBuilder conteudo = new StringBuilder();

        try (BufferedReader bf = new BufferedReader(new FileReader(caminho))) {

            String linha;

            while ((linha = bf.readLine()) != null) {
                conteudo.append(linha).append(" ");
            }


        } catch (IOException e) {
            System.out.println(String.format("Arquivo não encontrdado neste caminho: %s", caminho));
            e.printStackTrace();
            throw new UncheckedIOException(e);
        }

        return conteudo.toString();
    }
}
