package com.kleberbaldan.estudo.cursomc.resources.exceptions;

public class StandardError {

    private Integer status;
    private String mensagem;
    private Long timestamp;

    public StandardError(Integer status, String mensagem, Long timestamp) {
        this.status = status;
        this.mensagem = mensagem;
        this.timestamp = timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMensage() {
        return mensagem;
    }

    public void setMensage(String mensage) {
        this.mensagem = mensage;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
}
