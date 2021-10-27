package com.objects;

public class Produtos {

    private String name;
    private String company;
    private String code;

    Produtos(){
        String name = ""; //name of product
        String company = "";//name of client
        String code = ""; //code of product
    }
        //getters and setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getCompany() {
        return company;
    }

    public String getName() {
        return name;
    }
}
