package com.zixel.core;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ControladorTest {
    @Test
    public void ligarRoboAtravezDoControlador(){
        Robo robo = new Robo("zixel");
        Controlador controlador = new Controlador(robo);
        controlador.ligarRobo();
        assertTrue(robo.isLigado());
    }
    @Test
    public void deveDesligarRobo(){
        Robo robo = new Robo("zixel");
        Controlador controlador = new Controlador(robo);
        controlador.ligarRobo();
        controlador.desligarRobo();
        assertFalse(robo.isLigado());
    }
    @Test
    public void deveRejeitarDesligarRoboDesligadoControlador(){
        Robo robo = new Robo("zixel");
        Controlador controlador = new Controlador(robo);
        assertThrows(IllegalStateException.class,
                () -> { controlador.desligarRobo();});
    }
}
