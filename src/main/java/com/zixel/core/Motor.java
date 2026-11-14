package com.zixel.core;

public class Motor {
    private int velocidade = 0;
    private static final int VELOCIDADE_MAXIMA = 100;
    private static final int VELOCIDADE_MINIMA = -100;
    public void definirVelocidade(int velocidade){
        if(velocidade > VELOCIDADE_MAXIMA || velocidade < VELOCIDADE_MINIMA){
            throw new IllegalArgumentException("velocidade invalida");
        }
        this.velocidade = velocidade;

    }
    public int getVelocidade(){
        return this.velocidade;
    }

}
