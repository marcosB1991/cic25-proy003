package es.cic.curso25;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    public void testLanzar(){
      Calculadora calculadora1 = new Calculadora();
      Calculadora c= calculadora1;

        calculadora1.total=3;
    }
}
