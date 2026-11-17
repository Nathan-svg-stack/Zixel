package com.zixel.core;

public class zixelMain {
    public static void main(String[] args) {
        Robo robo = new Robo("Zixel");
        robo.ligar();
        robo.definirVelocidade(50);
        System.out.println(robo.isMovendo());
        robo.desligar();
        System.out.println(robo.isMovendo());


    }}
