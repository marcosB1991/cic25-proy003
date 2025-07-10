package es.cic.curso25;

public class Coche {
    private Calculadora calculadora;
    private final double CONSUMO_INSTANTANEO= 4.3;
    private int velocidad=0;

    public Coche(){
        this.calculadora= new Calculadora();
    }

    public int getVelocidad() {

       return velocidad;
    }

    public double getConsumo() {
        this.calculadora.limpiar();
        this.calculadora.sumar(velocidad);
        this.calculadora.dividir(100);

        return (double)velocidad / 100 * CONSUMO_INSTANTANEO;
    }

    public int acelerar(int incrementoVelocidad){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.sumar(incrementoVelocidad);
        this.velocidad=(int) Math.round(calculadora.getTotal());
        return this.velocidad;
    }

    public int frenar(int decrementoVelocidad){
        this.calculadora.limpiar();
        this.calculadora.sumar(this.velocidad);
        this.calculadora.restar(decrementoVelocidad);
        this.velocidad=(int) Math.round(calculadora.getTotal());
        return this.velocidad;
    }

}
