package program;


import cambio.Cambio;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Cambio valor = new Cambio();
        System.out.println("Qual o valor do dolar?");
        valor.valorDolar = sc.nextDouble();
        System.out.println("Quantos dolares você deseja comprar? ");
        double compra = sc.nextDouble();

        System.out.printf("Você tem que pagar %.3f", valor.calcularIof(compra));





    }
}
