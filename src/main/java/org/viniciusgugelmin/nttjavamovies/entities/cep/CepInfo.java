package org.viniciusgugelmin.nttjavamovies.entities.cep;

public class CepInfo implements ICepInfo {
    /* Properties */

    private String cep;
    private String logradouro;
    private String bairro;
    private String localidade;
    private String uf;

    /* Getters */

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public String getUf() {
        return uf;
    }

    /* Setters */

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }
}
