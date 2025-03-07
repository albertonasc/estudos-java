package com.demo.set;

import java.util.HashSet;
import java.util.Set;

public class MainSet {

    public static void main(String[] args) {

        Set<String> conjuntoFrutas = new HashSet<>();

        conjuntoFrutas.add("Maça");
        conjuntoFrutas.add("Banana");
        conjuntoFrutas.add("Abacaxi");
        conjuntoFrutas.add("Uva");
        conjuntoFrutas.add("Abacaxi");

        System.out.println(conjuntoFrutas);
        System.out.println(conjuntoFrutas.isEmpty());

        System.out.println(conjuntoFrutas.contains("Uva"));

        System.out.println(conjuntoFrutas.remove("Maça"));
        System.out.println(conjuntoFrutas);


    }
}
