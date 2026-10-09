package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i < n; i++){
            System.out.println("Digite uma altura: ");
            vector[i] = sc.nextDouble();
        }
        double soma = 0;
        for(int i = 0; i < vector.length; i++){
            System.out.println("");
            soma = vector[i] + soma;
            System.out.printf("Soma atual: %.2f", soma);
        }
        double media = soma/n;
        System.out.printf("%nA media de altura é: %.2f", media);



        sc.close();
    }
}
