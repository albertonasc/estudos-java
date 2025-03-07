package com.demo.map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {

        Map<String, String> mapaFrutas = new HashMap<>();

        mapaFrutas.put("B", "Banana");
        mapaFrutas.put("M", "Maça");
        mapaFrutas.put("U", "Uva");
        mapaFrutas.put("A", "Abacaxi");

        System.out.println(mapaFrutas.isEmpty());
        System.out.println(mapaFrutas);

        System.out.println(mapaFrutas.get("B"));

        mapaFrutas.remove("M");
        System.out.println(mapaFrutas);
        System.out.println(mapaFrutas.values());

    }
}
