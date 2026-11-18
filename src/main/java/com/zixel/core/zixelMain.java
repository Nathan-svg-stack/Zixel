package com.zixel.core;

public class zixelMain {
    public static void main(String[] args) {
        Robo robo = new Robo("Zixel", new Motor());
        Robo robo1 = new Robo("atom", new MotorHidraulico());
        robo.ligar();
        robo1.ligar();
        robo.definirVelocidade(60);
        robo1.definirVelocidade(-40);
        System.out.println(robo.getVelocidade());
        System.out.println(robo1.getVelocidade());


    }}
