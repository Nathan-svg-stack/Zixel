package com.zixel.core;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class EstadoRoboTest {
    Robo robo = new Robo("zixel", new MotorHidraulico());

    @Test
    void deveRetornarParado(){
        robo.ligar();
        assertEquals(EstadoRobo.PARADO, robo.getEstadoRobo());
    }
    @Test
    void deveRetornarMovendo(){
        robo.ligar();
        robo.definirVelocidade(50);
        assertEquals(EstadoRobo.MOVENDO, robo.getEstadoRobo());
    }
    @Test
    void deveRejeitarVelocidadeInvalida(){
        robo.ligar();
        robo.definirVelocidade(50);
        assertThrows(IllegalArgumentException.class, ()->{
            robo.definirVelocidade(150);
        });
        assertEquals(EstadoRobo.MOVENDO, robo.getEstadoRobo());
        assertEquals(50, robo.getVelocidade());
    }
    @Test
    void rejeitarLigarMovendo(){
        robo.ligar();
        robo.definirVelocidade(40);
        assertEquals(EstadoRobo.MOVENDO, robo.getEstadoRobo());
        assertThrows(IllegalStateException.class, ()-> {
            robo.ligar();
        });
        assertEquals(EstadoRobo.MOVENDO, robo.getEstadoRobo());
        assertEquals(40, robo.getVelocidade());
    }
}
