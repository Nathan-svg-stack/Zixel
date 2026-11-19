    package com.zixel.core;
    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertThrows;
    public class MotorHidraulicoTest {
        MotorControlavel motor = new MotorHidraulico();
        @Test
        void deveIniciarComZero(){
            assertEquals(0, motor.getVelocidade());

        }
        @Test
        void deveAceitarVelocidadeNegativa(){
            motor.definirVelocidade(-50);
            assertEquals(-50, motor.getVelocidade());
        }
        @Test
        void deveRejeitarVelocidadeInvalida(){
            assertThrows(IllegalArgumentException.class, () -> {
            motor.definirVelocidade(-101);
            });

        }
    }
