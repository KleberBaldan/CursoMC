package com.kleberbaldan.estudo.cursomc.domain.enums;

public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURIDICA(2, "Pessoa Jurídica");

    private int id;
    private String descricao;

    TipoCliente(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoCliente toEnum(Integer id) {
        if (id == null) return null;

        for (TipoCliente t : TipoCliente.values()) {
            if (id.equals(t.id)) return t;
        }

        throw new IllegalArgumentException("Id inválido: " + id);

    }
}
