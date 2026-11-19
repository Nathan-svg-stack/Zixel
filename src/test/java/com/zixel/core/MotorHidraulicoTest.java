    package com.zixel.core;
    import org.junit.jupiter.api.Test;
    import static org.junit.jupiter.api.Assertions.assertEquals;
    import static org.junit.jupiter.api.Assertions.assertThrows;
    public class MotorHidraulicoTest {
        MotorControlavel motorHidraulico = new MotorHidraulico();
        @Test
        void deveIniciarComZero(){
            assertEquals(0, motorHidraulico.getVelocidade());

        }
        @Test
        void deveAceitarVelocidadeNegativa(){
            motorHidraulico.definirVelocidade(-50);
            assertEquals(-50, motorHidraulico.getVelocidade());
        }
        @Test
        void deveRejeitarVelocidadeInvalida(){
            assertThrows(IllegalArgumentException.class, () -> {
            motorHidraulico.definirVelocidade(-101);
            });
        }
        @Test
        void deveIniciarComVelocidadeDefinida(){
            motorHidraulico .definirVelocidade(99);
            assertEquals(99, motorHidraulico.getVelocidade());
        }
        @Test
        public void verificarSeACeitaMenosCem(){
            motorHidraulico.definirVelocidade(-100);
            assertEquals(-100, motorHidraulico.getVelocidade());
        }
        @Test
        void aceitarCem(){
            motorHidraulico.definirVelocidade(100);
            assertEquals(100, motorHidraulico.getVelocidade());}
        // a partir daqui nao sei se vai ta repetindo
        @Test
        void devePreservarVelocidadeAnteriorQuandoUmaEntradaInvalidaForRecebida(){
            motorHidraulico.definirVelocidade(50);
            assertEquals(50, motorHidraulico.getVelocidade());
            assertThrows(IllegalArgumentException.class, ()-> {
                motorHidraulico.definirVelocidade(999);
            });
            assertEquals(50, motorHidraulico.getVelocidade());
        }
        @Test
        void deveRejeitarNumeroPositivoInvalido(){
            assertThrows(IllegalArgumentException.class, ()-> {
               motorHidraulico.definirVelocidade(101);
            });
        }
    }
