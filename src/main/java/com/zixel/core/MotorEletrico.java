package com.zixel.core;

    public class MotorEletrico implements MotorControlavel{
    private int velocidade = 0;
    private static final int VELOCIDADE_MAXIMA = 100;
    private static final int VELOCIDADE_MINIMA = -100;

    @Override
    public void definirVelocidade(int velocidade){
        if(velocidade > VELOCIDADE_MAXIMA || velocidade < VELOCIDADE_MINIMA){
            throw new IllegalArgumentException("velocidade invalida");
        }
        this.velocidade = velocidade;
    }
    @Override
    public int getVelocidade(){
        return this.velocidade;
    }

}
