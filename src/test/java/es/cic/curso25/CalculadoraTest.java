package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testLanzar() {
        Calculadora calculadora1 = new Calculadora();
        Calculadora calculadora2= calculadora1;
        calculadora2.setTotal(3);
        double valorActual = calculadora2.getTotal();

    }
}
