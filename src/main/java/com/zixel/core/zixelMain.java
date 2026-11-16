package com.zixel.core;

public class zixelMain {
    public static void main(String[] args) {
        Robo robo = new Robo("Zixel");
        //ligue o robô, defina a velocidade como 30, desligue-o e consulte getVelocidade().
        try {
            robo.desligar();
            System.out.println("ligou certinho");
            //teste para desligar o robo mesmo ja desligado
        }catch(IllegalArgumentException erro){
            System.out.println("nao ligou tente verificar se nao errou  nada" + erro.getMessage());
        //coloquei illegal argument pra testar se realmente nao tem diferenca a ordem
        }catch(IllegalStateException erro2){
            System.out.println("nao ligou, e aqui e o erro 2" + erro2.getMessage());
// o certo e ele dar erro de estado, no caso onde esta esse bloco de falas
        }
    }}
