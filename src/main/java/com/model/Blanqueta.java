package com.model;

public class Blanqueta {
    private String localizacao;//
    private Maquina maquina;//
    private String faca;//
    private String obs;//
    private Integer repeticoes;
    private Integer id;//


    public Blanqueta(){

    }

    public Blanqueta(String posicao,Maquina maquina, String fac,String obs, int repeticoes) {
        this.localizacao = posicao;
        this.maquina = maquina;
        this.faca = fac;
        this.obs = obs;
        this.repeticoes = repeticoes;
        this.id = null;
    }

    public Blanqueta(String posicao,Maquina maquina, String fac,String obs, int repeticoes, int id) {
        this.localizacao = posicao;
        this.maquina = maquina;
        this.faca = fac;
        this.obs = obs;
        this.repeticoes = repeticoes;
        this.id = id;
    }

    // getters and setters


    public String getObs() {
        return obs;
    }

    public int getId() {
        return id;
    }

    public String getLocalizacao() {
        return this.localizacao;
    }

    public Maquina getMaquina() {
        return this.maquina;
    }

    public String getFaca() {
        return this.faca;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }

    public void setFaca(String faca) {
        this.faca = faca;
    }

    public void setMaquina(Maquina maquina) {
        this.maquina = maquina;
    }


    public void setObs(String obs) {
        this.obs = obs;
    }

    public void setId(int id) {
        this.id = id;
    }


    /**
     * Caso algum dos campos obrigatorios no banco de dados nao seja atendido
     * irá retornar seu respectivo caso;
    */
    public int validarDados(){
        if(this.getLocalizacao().isBlank())
        {
            return 1; //campo de localização em branco.
        }else if(this.maquina.toString().isBlank())
        {
            return 2; //nao foi inserido nenhum maquina
        }else if(this.faca.toString().isBlank())
        {
            return 3; // campo de faca nao preeenchido
        }else if(this.repeticoes.toString().isBlank())
        {
            return 4; //campo de repeticoes nao preenchido
        }
        return 0; // todos os campos estão OK.
    }

    @Override
    public String toString() {
        return "Blanqueta{" +
                "localizacao='" + localizacao + '\'' +
                ", maquina=" + maquina +
                ", faca=" + faca +
                ", exposicoes=" + repeticoes +
                '}';
    }
}


