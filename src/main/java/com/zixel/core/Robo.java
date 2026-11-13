package com.zixel.core;

public class Robo {
    private String nome;
    private boolean ligado = false;
    public Robo(String nome){
        this.nome = nome;
    }
    public void ligar(){
        if (this.ligado){
            throw new IllegalStateException("Robo ja esta ligado");
        }
            this.ligado = true;
          }
    public boolean isLigado(){
        return this.ligado;
    }
    public void desligar(){
        if(!this.ligado){
            throw new IllegalStateException("O robo ja esta desligado");
        }
        this.ligado = false;
    }
}
