package org.viniciusgugelmin.nttjavamovies.entities.cep;

public interface ICepInfo {
    /* Getters */

    String getCep();

    String getLogradouro();

    String getBairro();

    String getLocalidade();

    String getUf();

    /* Setters */

    void setCep(String cep);

    void setLogradouro(String logradouro);

    void setBairro(String bairro);

    void setLocalidade(String localidade);

    void setUf(String uf);
}
