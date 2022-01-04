package com.objects;

public class Produto {

    private String name;
    private String empresa;
    private String code;

    public Produto(){

    }
    public Produto(String nome,String empresa, String codigo){
      this.name = nome;
      this.empresa = empresa;
      this.code = codigo;
    }
        //getters and setters

    @Override
    public String toString() {
        return "Produto{" +
                "name='" + name + '\'' +
                ", empresa='" + empresa + '\'' +
                ", code='" + code + '\'' +
                '}';
    }

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
