package com.zixel.core;

public class zixelMain {
    public static void main(String[] args) {
        Robo robo = new Robo("Zixel");
        System.out.println(robo.isLigado());
        robo.ligar();
        System.out.println(robo.isLigado());
        robo.desligar();
        System.out.println(robo.isLigado());

}}
