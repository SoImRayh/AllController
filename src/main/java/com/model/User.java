package com.model;

public class User {
    private String cpf;
    private String nome;
    private String senha;
    private boolean adminstrador;

    public User(){}

    public User(String cpf , String nome, String senha,boolean adminstrador) {
        this.cpf = cpf;
        this.nome = nome;
        this.senha = senha;
        this.adminstrador = adminstrador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;


        this.nome = nome;
        this.senha = senha;
        this.adminstrador = false;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdminstrador() {
        return adminstrador;
    }

    public void setAdminstrador(boolean adminstrador) {
        this.adminstrador = adminstrador;
    }

    public int verificarDados(){
        if(this.nome.isEmpty())
        {
            return 1; // campo de nome nao preenchido
        }else if(this.senha.isBlank())
        {
            return 2;// campo de senha nãp preenchido
        }
        return 0;
    }
}