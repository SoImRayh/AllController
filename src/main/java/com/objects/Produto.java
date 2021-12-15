package com.objects;

public class Produto {

    private String name;
    private String empresa;
    private String code;

    Produto(){
        String name = ""; //name of product
        String company = "";//name of client
        String code = ""; //code of product
    }
        //getters and setters
    public void setCode(String code) {
        this.code = code;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getName() {
        return name;
    }
}
