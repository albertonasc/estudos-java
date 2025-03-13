package com.demo.textify;

import java.lang.invoke.StringConcatFactory;
import java.util.Map;

public class ImpressoraResultado {

    public static void imprimirResultado(Map<String, Integer> resultado) {

        System.out.println("============== RESULTADO ================");
        for(Map.Entry<String, Integer> entry  : resultado.entrySet()) {

            System.out.println(" " + entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("==========================================");
    }

}
