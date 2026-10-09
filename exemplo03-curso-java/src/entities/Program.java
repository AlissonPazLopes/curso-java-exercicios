package entities;

import peoples.Peoples;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pessoas a serem cadastradas: ");
        int numerodepessoas = sc.nextInt();

        Peoples[] peoples = new Peoples[numerodepessoas];

        for(int i = 0; i < numerodepessoas; i++){
            System.out.printf("%nDigite o nome da %da pessoa: ", i+1);
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("%nDigite a idade dessa pessoa: ");
            int idade = sc.nextInt();
            System.out.printf("%nDigite a altura dessa pessoa: ");
            double alutura = sc.nextDouble();
            peoples[i] = new Peoples(nome, idade, alutura);
        }

        double somaaltura = 0;

        for(int i = 0; i < numerodepessoas; i++){
            somaaltura += peoples[i].getAltura();

        }

        double media = somaaltura/numerodepessoas;
        System.out.printf("%nAltura média: %.2f", media);

        int menordeidade = 0;
        for(int i = 0; i < numerodepessoas; i++ ){

            if (peoples[i].getIdade() < 16) {
                menordeidade = menordeidade + 1;


            }


        }

        double porcentagem = 0;
        porcentagem = (menordeidade * 100) / numerodepessoas;
        System.out.printf("%nPorcentagem de menor de idade: %.2f porcento", porcentagem);
        System.out.print("%");
        System.out.println();
        for(int i = 0; i < numerodepessoas; i++ ){
            if (peoples[i].getIdade() < 16) {
                System.out.println(peoples[i].getName());


            }


        }




    }

}

