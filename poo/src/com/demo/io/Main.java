package com.demo.io;

import java.io.*;

public class Main {

    public static void main(String[] args) {

        writeFile();
        readFile();
    }

    private static void readFile() {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(ArquivoConfig.PATH + "/exemplo.txt"))) {

            String linha;

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void writeFile() {
        try (BufferedWriter bufferedWriter = new BufferedWriter( new FileWriter(ArquivoConfig.PATH + "/exemplo.txt"))) {

            bufferedWriter.write("Teste escrita primeira linha");
            bufferedWriter.newLine();
            bufferedWriter.write("Segunda linha");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("rodape");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
