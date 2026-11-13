package com.zixel.core;

public class Robo {
    private String nome = "Zixel";
    private boolean ligado = false;
    public Robo(String nome, boolean ligado){
        this.nome = nome;
        this.ligado = ligado;

    }public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public boolean isLigado(){
        return this.ligado;
    }
    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }
    public void ligar(){
        this.ligado = true;
    }
    public void desligar(){
        this.ligado = false;
    }


}
