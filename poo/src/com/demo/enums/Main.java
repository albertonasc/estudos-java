package com.demo.enums;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Usuario kelly = new Usuario("Kelly", NivelAcesso.ADMIN, "k.sysd@tutamail.com");

        kelly.mostrarInfo();

    }
}
