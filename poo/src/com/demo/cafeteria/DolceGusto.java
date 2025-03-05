package com.demo.cafeteria;

public class DolceGusto implements MaquinaCafe {

    private boolean ligada;
    private boolean resistenciaLigada;
    private boolean possuiCachimbo;
    private ModoCafe modoCafeSelecionado;
    private int qtdAguaCaldeira;

    @Override
    public void ligar() {
        System.out.println("Ligando a Dolce Gusto...");
        this.ligada = true;
    }

    @Override
    public void desligar() {
        System.out.println("Desligando a Dolce Gusto...");
        this.ligada = false;
    }

    @Override
    public void colocarCachimbo() {
        System.out.println("Cachimbo inserido...");
        this.possuiCachimbo = true;
    }

    @Override
    public void retirarCachimbo() {
        System.out.println("Cachimbo removido...");
        this.possuiCachimbo = false;
    }

    @Override
    public void selecionarModo(ModoCafe modoCafe) {
        System.out.println("Modo de café selecionado: " + modoCafe.getDescricao());
        this.modoCafeSelecionado = modoCafe;
    }

    @Override
    public void fazerCafe() {
        if (isLigada()) {
            if (this.possuiCachimbo) {

                if(modoCafeSelecionado != null) {
                    // pode fazer cafe
                    this.injetarAguaCaldeira(300);
                    this.ligarResistencia();

                    System.out.println("Fazendo " + this.modoCafeSelecionado.getDescricao()  + "!");
                    System.out.println("Café pronto!");

                    this.esvaziarCaldeira();
                    this.desligarResistencia();

                } else {
                    System.out.println("Modo de café naõ foi selecionado. Selecione antes de prosseguir");
                }

            } else {
                System.out.println("Dolce Gusto esta sem o cachimbo. Coloque o cachimbo");
            }


        } else {
            System.out.println("Dolce Gusto está desligada");
        }

    }

    private boolean isLigada() {
        return this.ligada;
    }


    private void injetarAguaCaldeira(int qtdAguaCaldeira) {
        System.out.println("Injetando " + qtdAguaCaldeira + "ml de agua na caldeira...");
        this.qtdAguaCaldeira = 300;
    }

    private void esvaziarCaldeira() {
        System.out.println("Esvaziando " + this.qtdAguaCaldeira + "ml da caldeira...");
        this.qtdAguaCaldeira = 0;
        System.out.println("Caldeira esvaziada...");
    }

    private void ligarResistencia() {
        System.out.println("Ligando a resistencia...");
        this.resistenciaLigada = true;
    }

    private void desligarResistencia() {
        System.out.println("Desligando a resistencia...");
        this.resistenciaLigada = false;
    }

}
