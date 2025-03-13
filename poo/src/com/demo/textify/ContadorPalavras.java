package com.demo.textify;

import java.util.HashMap;
import java.util.Map;

public class ContadorPalavras {

    public static Map<String, Integer> contadorPalavras(String conteudo) {

        Map<String, Integer> resultado = new HashMap<>();

        String[] palavras = conteudo.split("\\s+");

        for(String palavra : palavras) {
            Integer qtdAparicoes = resultado.getOrDefault(palavra, 0);
            qtdAparicoes++;
            resultado.put(palavra, qtdAparicoes);
        }

        return resultado;
    }

}
