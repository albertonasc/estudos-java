package com.demo.sistemabancario;

public class ContaCorrente {

    private String cpf;
    private String nomeCompleto;
    private double saldo;

    public ContaCorrente(String cpf, String nomeCompleto) {
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
        this.saldo = 0;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if(valor < this.saldo) {
            this.saldo -= valor;
        }
    }

    public void transferir(double valor, ContaCorrente ccDestino) {
        if(valor > 0) {
            sacar(valor);
            ccDestino.depositar(valor);
            System.out.println("Transferencia realizada de " + this.nomeCompleto + " para " + ccDestino.getNomeCompleto()
                    + " no valor de R$ " + valor);
        }
    }

    public double verSaldo() {
        System.out.println("Saldo da conta do(a) " + this.nomeCompleto + " eh: R$ " + this.saldo);
        return this.saldo;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }
}
