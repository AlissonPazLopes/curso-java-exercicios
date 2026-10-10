package entities;
// quantos quartos a pessoa vai querer
// esses quartos vão de 0 a 9;
// da para escolher de 0 a 9 qual quarto, exemplo eu escolho o quarto 8
// tenho que retornar os quartos escolhidos
// para se cadastrar no quarto deve haver nome, email e o numero do quarto


import pensionato.Pensionato;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] agrs){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int numerodequartos = 9;
        Pensionato[] pensionato = new Pensionato[numerodequartos];

        System.out.println("Digite o numero de quartos que deseja alugar: ");
        int alugar = sc.nextInt();
        for(int i = 0; i < alugar; i++){
            System.out.printf("Alugando %d quarto.%n", i+1);
            System.out.printf("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.printf("Email: ");
            String email = sc.nextLine();
            System.out.printf("Digite o número do quarto: ");
            int numerodoquarto = sc.nextInt();
            pensionato[numerodoquarto] = new  Pensionato(nome, email);
            System.out.printf("%n");

        }


        for(int i = 0; i < numerodequartos; i++){
            if (pensionato[i] != null ){
                System.out.printf("Quarto %d: ", i);
                System.out.printf(pensionato[i].getName());
                System.out.printf(", ");
                System.out.printf(pensionato[i].getEmail());
                System.out.printf("%n");

            }

        }





    }



}
