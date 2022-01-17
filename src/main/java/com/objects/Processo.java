package com.objects;

import java.util.Date;

public class Processo {
    //atributos
    private Date data;//
    private Produto produto;//
    private Blanqueta blanqueta;//

    public Processo(Date data,Produto produto,Blanqueta blanqueta ){
        this.blanqueta = blanqueta;
        this.data = data;
        this.produto = produto;
    }

    public Date getData() {
        return data;
    }

    public Produto getProduto() {
        return produto;
    }

    public Blanqueta getBlanqueta() {
        return blanqueta;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setBlanqueta(Blanqueta blanqueta) {
        this.blanqueta = blanqueta;
    }
}
