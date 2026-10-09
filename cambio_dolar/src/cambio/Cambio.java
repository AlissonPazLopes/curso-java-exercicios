package cambio;


public class Cambio {

    public double taxaIOF = 0.06;
    public double valorDolar;

    public double calcularIof(double compra){
        compra = compra * valorDolar + (taxaIOF * (compra * valorDolar));
        return compra;

    }



}
