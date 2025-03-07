package com.demo.list;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> listaFrutas = new ArrayList<>();
        listaFrutas.add("Melancia");
        listaFrutas.add("Maça");
        listaFrutas.add("Abacaxi");
        listaFrutas.add("Maça");
        listaFrutas.add("Banana");

        System.out.println(listaFrutas);
        System.out.println(listaFrutas.isEmpty());

        // recuperar
        System.out.println(listaFrutas.get(2));

        // remover
        System.out.println(listaFrutas.remove(4));
        System.out.println(listaFrutas);

        // ver o total de itens
        System.out.println(listaFrutas.size());


    }

}
