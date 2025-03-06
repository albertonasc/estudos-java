package com.demo.estadio;

public class Main {

    public static void main(String[] args) {

        JogadorBasquete mj = new JogadorBasquete("Michael Jordan", 23, 2, 38);

        mj.arremessar();
        mj.fazerEnterradas();

        System.out.println(mj);
    }
}
