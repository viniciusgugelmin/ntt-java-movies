package org.viniciusgugelmin.nttjavamovies.application.config.exception.custom;

public class CepNotFoundException extends RuntimeException {

    public CepNotFoundException(String cep) {
        super(String.format("CEP %s not found", cep));
    }
}