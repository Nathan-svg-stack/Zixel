package com.zixel.core;

public class zixelMain {
    public static void main(String[] args) {
        Robo robo = new Robo("Zixel");
//testar três situações: robô desligado, robô ligado com velocidade válida e robô ligado com velocidade inválida.
        System.out.println(robo.isLigado());
        robo.ligar();
        System.out.println(robo.isLigado());
        robo.definirVelocidade(30);
        System.out.println(robo.getVelocidade());;
        robo.definirVelocidade(150);
        System.out.println(robo.getVelocidade());
    }}
