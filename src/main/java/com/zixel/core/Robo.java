package com.zixel.core;

public class Robo {
    private String nome;
    private boolean ligado = false;
    private boolean movendo = false;
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
            throw new IllegalStateException("erro");
        }
        this.definirVelocidade(0);
        this.ligado = false;
    }
    public void definirVelocidade(int velocidadeEscolhida) {
        if(!isLigado()){
            throw new IllegalStateException("o robo esta desligado, por favor ligar antes, pera mas se ta desligado como eu sei?");
        }
        motor.definirVelocidade(velocidadeEscolhida);
        this.movendo = velocidadeEscolhida != 0;

        }
        public boolean isMovendo(){
        return this.movendo;

    }
    public int getVelocidade(){
        return motor.getVelocidade();
    }
}
