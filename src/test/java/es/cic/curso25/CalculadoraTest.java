package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora cut = new Calculadora();
        cut.sumar(5.6);

        double valorActual = cut.getTotal();
        assertEquals(5.6, valorActual, 0.00001);
        

    }

    @Test
    public void testRestar() {
        Calculadora cut = new Calculadora();
        cut.restar(5.6);

        double valorActual = cut.getTotal();
        assertEquals(0, valorActual, 0.00001);
        
        
    }



}
