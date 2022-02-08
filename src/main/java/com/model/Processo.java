package com.model;

import java.time.LocalDate;


public class Processo {
    //atributos
    private LocalDate data;//
    private Produto produto;//
    private Blanqueta blanqueta;//

    public Processo(){}

    public Processo(LocalDate data, Produto produto, Blanqueta blanqueta ){
        this.blanqueta = blanqueta;
        this.data = data;
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Processo{" +
                "data=" + data +
                ", produto=" + produto +
                ", blanqueta=" + blanqueta +
                '}';
    }

    public LocalDate getData() {
        return data;
    }

    public Produto getProduto() {
        return produto;
    }

    public Blanqueta getBlanqueta() {
        return blanqueta;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public void setBlanqueta(Blanqueta blanqueta) {
        this.blanqueta = blanqueta;
    }

    public int autenticarDados()
    {
        if (this.data.toString().isBlank())
        {
            return 1; //campo de data nao preenchido
        }
        return 0;
    }
}
