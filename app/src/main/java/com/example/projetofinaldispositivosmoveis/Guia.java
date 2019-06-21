package com.example.projetofinaldispositivosmoveis;

public class Guia {
    private String idAnimal;
    private String nomeAnimal;
    private String idadeAnimal;
    private String pesoAnimal;
    private String racaAnimal;
    private String tipoAnimal;
    private String observacaoAnimal;
    private String telefoneDono;
    private String donoNome;

    public Guia(String idAnimal, String nomeAnimal, String idadeAnimal, String pesoAnimal, String racaAnimal,
                String tipoAnimal, String observacaoAnimal, String telefoneDono, String donoNome) {
        this.idAnimal = idAnimal;
        this.nomeAnimal = nomeAnimal;
        this.idadeAnimal = idadeAnimal;
        this.pesoAnimal = pesoAnimal;
        this.racaAnimal = racaAnimal;
        this.tipoAnimal = tipoAnimal;
        this.observacaoAnimal = observacaoAnimal;
        this.telefoneDono = telefoneDono;
        this.donoNome = donoNome;
    }

    public Guia() {

    }

    public String getIdAnimal() { return idAnimal;}

    public void setIdAnimal(String idAnimal) { this.idAnimal = idAnimal; }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getIdadeAnimal() {
        return idadeAnimal;
    }

    public void setIdadeAnimal(String idadeAnimal) {
        this.idadeAnimal = idadeAnimal;
    }

    public String getPesoAnimal() {
        return pesoAnimal;
    }

    public void setPesoAnimal(String pesoAnimal) {
        this.pesoAnimal = pesoAnimal;
    }

    public String getRacaAnimal() {
        return racaAnimal;
    }

    public void setRacaAnimal(String racaAnimal) {
        this.racaAnimal = racaAnimal;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public String getObservacaoAnimal() {
        return observacaoAnimal;
    }

    public void setObservacaoAnimal(String observacaoAnimal) {  this.observacaoAnimal = observacaoAnimal; }

    public String getTelefoneDono() {
        return telefoneDono;
    }

    public void setTelefoneDono(String telefoneDono) {
        this.telefoneDono = telefoneDono;
    }

    public String getDonoNome() {
        return donoNome;
    }

    public void setDonoNome(String donoNome) {
        this.donoNome = donoNome;
    }
}
