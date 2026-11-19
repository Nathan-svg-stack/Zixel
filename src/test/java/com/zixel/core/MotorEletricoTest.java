package com.zixel.core;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class MotorEletricoTest {
    MotorEletrico motorEletrico = new MotorEletrico();
    @Test
    void deveIniciarComVelocidadeZero(){
        assertEquals(0, motorEletrico.getVelocidade());
    }
    @Test
    void deveRejeitarVelocidadeAcimaDoLimite(){
            assertThrows(IllegalArgumentException.class,  () -> {
                motorEletrico.definirVelocidade(150);
            });}
    @Test
    void deveIniciarComVelocidadePositiva(){
        motorEletrico.definirVelocidade(99);
        assertEquals(99, motorEletrico.getVelocidade());

        }
    @Test
    void DeveRejeitarVelocidadeAbaixoDoLimite(){
       assertThrows(IllegalArgumentException.class, () ->{
           motorEletrico.definirVelocidade(-101);
       });}
    @Test
    public void verificarSeACeitaMenosCinquenta(){
        motorEletrico.definirVelocidade(-50);
        assertEquals(-50, motorEletrico.getVelocidade());
    }
    @Test
    void aceitarCem(){
        motorEletrico.definirVelocidade(100);
        assertEquals(100, motorEletrico.getVelocidade());
    }
        }




