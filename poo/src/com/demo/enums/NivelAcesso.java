package com.demo.enums;

public enum NivelAcesso {

    ADMIN("Administrador do Sistema"),
    USUARIO("Usuario do sistema"),
    CONVIDADO("Convidado do Sistema");

    private String descricao;

    NivelAcesso(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return this.descricao;
    }
}
