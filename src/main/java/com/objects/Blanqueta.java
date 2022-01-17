package com.objects;

public class Blanqueta {
    private Maquina maquina;//
    private String localizacao;//
    private String faca;//
    private String obs;//
    private Integer id = null;//
    private Integer repeticoes;

    public Blanqueta(){

    }

    public Blanqueta(String posicao,String maquina, String fac, int exposicoes) {
        String position = posicao; // position ex: A1, E3
        String machine =maquina;    //CD / KBA / XL
        int faca = 4560;       // ex: faca 172, 173
        int expositions = 6;    //number of expositions 3,4,6++

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


