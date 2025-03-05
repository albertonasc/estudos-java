package com.demo.caneta;

public class Caneta {

    protected String cor;
    protected String marca;
    protected double ponta;
    protected int carga;
    private boolean tampada;

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }

    protected void escrever(String texto) {
        System.out.println(texto);
    }

    public void status() {
        System.out.println("================");
        System.out.println("Cor: " + this.cor);
        System.out.println("Marca: " + this.marca);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

}
