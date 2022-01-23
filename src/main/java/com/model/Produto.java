package com.model;

public class Produto {

    private String name;//
    private Integer empresa;//
    private String code;//

    public Produto(){

    }
    public Produto(String nome,Integer empresa, String codigo){
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

    public void setEmpresa(int empresa) {
        this.empresa = empresa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public int getEmpresa() {
        return empresa;
    }

    public String getName() {
        return name;
    }

    public int autenticarDados(){
        if(this.code.isBlank())
        {
            return 1;//campo de código nao preenchido
        }else if (this.name.isBlank())
        {
            return 2;//campo de nome nao preenchido
        }else if(this.empresa.toString().isBlank())
        {
            return 2;//campo de empresa nao preenchido corretamente
        }

        return 0;
    }
}
