package com.demo.textify;

import java.util.Map;
import java.util.Scanner;

public class Textify {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("### Bem vindo ao Textify! ###");

        System.out.println("Indique o caminho para o arquivo de texto: ");
        String caminho = sc.nextLine();

        String conteudo = LeitorArquivo.lerArquivo(caminho);
        String conteudoNormalizado = NormalizadorConteudo.converterMinusculo(conteudo);
        Map<String, Integer> resultado = ContadorPalavras.contadorPalavras(conteudoNormalizado);
        ImpressoraResultado.imprimirResultado(resultado);

    }
}
