package com.model;

public class Admin extends User{
    private Boolean power;

    public Admin(String nome, String senha) {
        super(nome, senha);
    }


    public Admin promoverUser(User user){
        Admin adm = (Admin) user;
        adm.power = true;
        return adm;
    }

}
