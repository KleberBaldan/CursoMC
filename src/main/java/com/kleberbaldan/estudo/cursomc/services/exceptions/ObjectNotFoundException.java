package com.kleberbaldan.estudo.cursomc.services.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    public ObjectNotFoundException(String mensagem) {
        super(mensagem);
    }

    public ObjectNotFoundException(String mensagem, Throwable e) {
        super(mensagem, e);
    }
}
