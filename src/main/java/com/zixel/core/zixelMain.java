package com.zixel.core;

public class zixelMain {
    public static void main(String[] args) {
        Robo robo = new Robo("Zixel", true);
        robo.desligar();

        if(robo.isLigado()) {
            System.out.println("ta ligado");
        }else{
            System.out.println("ta nao");
        }
    }
}
