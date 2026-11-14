package com.zixel.core;

public class zixelMain {
    public static void main(String[] args) {
        Robo robo = new Robo("Zixel");
        Motor motor = new Motor();
        try{
            motor.definirVelocidade(80);
            System.out.println("se der erro se num roda nao");
        }catch(IllegalArgumentException erroteste){
            System.out.println("rodou nao pae se deve ter extrapolado ai"+ erroteste.getMessage());

        }

}}
