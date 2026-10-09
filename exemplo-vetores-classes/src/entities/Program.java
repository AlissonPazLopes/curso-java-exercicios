package entities;

import produtos.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.println("Digite a quantidade de itens que você deseja adicionar: ");
        int quantidadeProdutos = sc.nextInt();

        Product[] vect = new Product[quantidadeProdutos];

        double valores = 0;

        for(int i = 0; i < quantidadeProdutos; i++){
            System.out.println("Digite o nome do produto:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("Digite o preco: ");
            double price = sc.nextDouble();
            vect[i]= new Product(name, price);


        }

        for (int i = 0; i < quantidadeProdutos; i++){
            valores =  valores + vect[i].getVectorPrice();
        }

        double media =  valores / quantidadeProdutos;
        System.out.printf("Media dos valores: %.3f", media);


    }
}
