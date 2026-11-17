package com.zixel.core;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class MotorTest {
    Motor motor = new Motor();
    @Test
    void deveIniciarComVelocidadeZero(){
        assertEquals(0, motor.getVelocidade());
    }
    @Test
    void deveRejeitarVelocidadeAcimaDoLimite(){
            assertThrows(IllegalArgumentException.class,  () -> {
                motor.definirVelocidade(150);
            });}
    @Test
    void deveIniciarComVelocidadePositiva(){
        motor.definirVelocidade(99);o
        assertEquals(99, motor.getVelocidade());

        }
    @Test
    void DeveAceitarVelocidadeAbaixoDoLimite(){
       assertThrows(IllegalArgumentException.class, () ->{
           motor.definirVelocidade(-101);
       });}
    @Test
    public void verificarSeACeitaMenosCinquenta(){
        motor.definirVelocidade(-50);
        assertEquals(-50, motor.getVelocidade());
    }
    @Test
    void aceitarCem(){
        motor.definirVelocidade(100);
        assertEquals(100, motor.getVelocidade());
    }
        }




