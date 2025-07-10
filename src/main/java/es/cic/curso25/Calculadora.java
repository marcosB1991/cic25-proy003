package es.cic.curso25;

public class Calculadora {
    private double total =0.0d;

    public double getTotal() {
        return total;
    }

    public void sumar(double valor){
        total= total+valor; 
    }

    public void restar(double valor){
        total-=valor; 
    }

    public void multiplicar(double valor){
        total*=valor;
    }

    public void dividir(double valor){

        if(valor==0){
            throw new ArithmeticException("División por 0");
        }else{
            total/=valor;
        }

        
    }


    public void limpiar(){
        total=0;
    }


    

}
