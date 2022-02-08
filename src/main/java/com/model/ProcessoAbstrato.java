package com.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProcessoAbstrato {

    private LocalDate data;
    private String blanqueta;
    private String codProduto;
    private String nomeProduto;

    public ProcessoAbstrato(){}

    public ProcessoAbstrato(LocalDate data, String blanqueta, String codProduto, String nomeProduto) {
        this.data = data;
        this.blanqueta = blanqueta;
        this.codProduto = codProduto;
        this.nomeProduto = nomeProduto;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getBlanqueta() {
        return blanqueta;
    }

    public void setBlanqueta(String blanqueta) {
        this.blanqueta = blanqueta;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public static List<ProcessoAbstrato> toProcessoAbstrato(List<Processo> lista){
        List<ProcessoAbstrato> li = new ArrayList<>();
        ProcessoAbstrato p = new ProcessoAbstrato();
        for(int i = 0; i < lista.size();i++){
            p.setData(lista.get(i).getData());
            p.setBlanqueta(lista.get(i).getBlanqueta().getLocalizacao());
            p.setCodProduto(lista.get(i).getProduto().getCode());
            p.setNomeProduto(lista.get(i).getProduto().getName());

            li.add(p);
        }

        return li;
    }
}
