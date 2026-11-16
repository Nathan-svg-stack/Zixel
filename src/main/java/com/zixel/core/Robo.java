package com.zixel.core;

public class Robo {
    private String nome;
    private boolean ligado = false;
    private Motor motor;
    public Robo(String nome){
        this.nome = nome;
        this.motor = new Motor();
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
    public void definirVelocidade(int velocidadeEscolhida) {


    }
}
