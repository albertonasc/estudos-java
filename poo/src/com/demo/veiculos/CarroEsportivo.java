package com.demo.veiculos;

public final class CarroEsportivo extends Carro{

    private int qtdNitro;

    public CarroEsportivo(String marca, int anoFabricacao, String tipoTerreno, int numeroRodas, String tipoCombustivel, int qtdPortas, int qtdNitro) {
        super(marca, anoFabricacao, tipoTerreno, numeroRodas, tipoCombustivel, qtdPortas);
        this.qtdNitro = qtdNitro;
    }

    public void ativarNitro() {
        System.out.println("Nitro ativado!");
        this.qtdNitro = 0;
    }
}
