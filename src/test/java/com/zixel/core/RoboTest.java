package com.zixel.core;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RoboTest {
    Robo robo = new Robo("Zixel");
    @Test
    void verificarSeIniciaDesligado(){
        assertFalse(robo.isLigado());
    }
    @Test
    void ligarLigado(){
        robo.ligar();
        assertTrue(robo.isLigado());
    }
    @Test
    void deveRejeitarLigarQuandoJaEstiverLigado(){
        robo.ligar();
        assertThrows(IllegalStateException.class, () -> {
            robo.ligar();
        });
    }
    @Test
    void desligarNormalmenteRobo(){
        robo.ligar();
        robo.definirVelocidade(50);
        assertEquals(50, robo.getVelocidade());
        robo.desligar();
        assertFalse(robo.isLigado());
        assertEquals(0, robo.getVelocidade());
        assertFalse(robo.isMovendo());
    }
    @Test
    void tentarDesligarDesligado(){

        assertThrows(IllegalStateException.class, () -> {
            robo.desligar();
        });}
    @Test
    void alterarVelocidadeDesligado(){
        assertThrows(IllegalStateException.class, ()->{
            robo.definirVelocidade(50);
        });
    }
    @Test
    void deveIniciarSemEstarSeMovimentando(){
        robo.ligar();
        assertFalse(robo.isMovendo());
    }
    @Test
    void deveComecarMovimentarComVelocidadeDiferenteDeZero(){
        robo.ligar();
        robo.definirVelocidade(50);
        assertTrue(robo.isMovendo());
    }
    @Test
    void pararDeMovimentarRecebendoZero(){
        robo.ligar();
        robo.definirVelocidade(50);
        assertTrue(robo.isMovendo());
        robo.definirVelocidade(0);
        assertFalse(robo.isMovendo());
    }
    }

