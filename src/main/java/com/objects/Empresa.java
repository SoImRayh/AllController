package com.objects;

public class Empresa {
    //atributos
    String nome;
    int id;

    public Empresa(){}
    public Empresa(String nome){
        this.nome = nome;
    }
    public Empresa(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
