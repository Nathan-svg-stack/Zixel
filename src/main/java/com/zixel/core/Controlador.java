package com.zixel.core;

public class Controlador    {
    private Robo robo;
    public Controlador(Robo robo){
        this.robo = robo;
    }
    public void ligarRobo(){
        robo.ligar();
    }
    public void desligarRobo(){
        robo.desligar();
    }
}
