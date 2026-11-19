package com.zixel.core;
import java.util.Objects;

public class Robo {
    private String nome;
    private EstadoRobo estadoRobo = EstadoRobo.DESLIGADO;
    private MotorControlavel motor;
    public Robo(String nome, MotorControlavel motorcontrolavel){
        this.motor = Objects.requireNonNull(motorcontrolavel, "O Motor nao pode ser nulo, por favor inserir um motor valido");
        this.nome = nome;

    }
    public void ligar(){
        if (this.estadoRobo != EstadoRobo.DESLIGADO){
            throw new IllegalStateException("Robo ja esta ligado");
        }
            this.estadoRobo = EstadoRobo.PARADO;
          }
    public boolean isLigado(){
        return this.estadoRobo != EstadoRobo.DESLIGADO;
    }

    public void desligar(){
        if(this.estadoRobo == EstadoRobo.DESLIGADO){
            throw new IllegalStateException("erro");
        }
        this.definirVelocidade(0);
        this.estadoRobo = EstadoRobo.DESLIGADO;
    }
    public void definirVelocidade(int velocidadeEscolhida) {
        if(estadoRobo == EstadoRobo.DESLIGADO){
            throw new IllegalStateException("o robo esta desligado, por favor ligar antes, pera mas se ta desligado como eu sei?");
        }
        motor.definirVelocidade(velocidadeEscolhida);
        if (velocidadeEscolhida != 0){
            this.estadoRobo = EstadoRobo.MOVENDO;
        }else{
            this.estadoRobo = EstadoRobo.PARADO;
        }
        }
        public boolean isMovendo(){
        return this.estadoRobo == EstadoRobo.MOVENDO;
    }
    public EstadoRobo getEstadoRobo(){
        return this.estadoRobo;

    }
    public int getVelocidade(){
        return motor.getVelocidade();
    }
}
