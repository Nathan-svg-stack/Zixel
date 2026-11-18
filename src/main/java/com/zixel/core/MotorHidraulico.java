package com.zixel.core;

public class MotorHidraulico implements MotorControlavel{
    private int velocidadeDefinida = 0;
    @Override
    public void definirVelocidade(int velocidadeEscolhida){
        if (velocidadeEscolhida > 100 || velocidadeEscolhida < -100){
        throw new IllegalArgumentException("velocidade invalida");
        }else {
            velocidadeDefinida = velocidadeEscolhida;
        }
    }
    @Override
    public int getVelocidade(){
        return velocidadeDefinida;
    }
}