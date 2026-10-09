package program;

import produtos.Product;

import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    Product produto = new Product();
    System.out.println("Digite o nome do produto: ");
    produto.name = sc.nextLine();
    System.out.println("Digite o valor do produto: ");
    produto.price = sc.nextDouble();
    System.out.println("Digite a quantidade do produto: ");
    produto.quantity = sc.nextInt();

    System.out.printf("Nome: " + produto.name + "%nValor: " + produto.price + "%nQuantidade: " + produto.quantity +"%n");

    System.out.println("Você quer adicionar ou remover quantidades do produto? 1 para sim e 2 para nao");

    int resposta = sc.nextInt();

    while(resposta == 1){

        System.out.println("Você quer adicionar ou retirar itens?");

        System.out.println("Para Adicionar digite 1 e para Remover digite 2 ");

        int escolha = sc.nextInt();

        while(escolha !=1 && escolha != 2){
            System.out.println("Somente respostas 1 ou 2: ");

            escolha = sc.nextInt();
        }
        if (escolha == 1){
            System.out.println("Digite a quantidade de produtos que você quer adicionar: ");
            produto.adicionar = sc.nextInt();
            produto.adicionarProdutos(produto.adicionar);
            System.out.printf("Quantidade Atual: %d%n", produto.quantity);


        } else{
            System.out.println("Digite a quantidade de produtos que você quer remover: ");
            produto.remover = sc.nextInt();
            if(produto.remover > produto.quantity){
                System.out.printf("Você não pode remover uma quantidade que você não tem%n");
            }else{
                produto.removerProdutos(produto.remover);
                System.out.printf("Quantidade Atual: ");
                System.out.printf("%d%n",produto.quantity);
            }


        }

        System.out.println("Quer adicionar ou remover itens? digite 1 para sim e 2 para não");

        resposta = sc.nextInt();
        while(resposta != 1 && resposta != 2){
            System.out.println("Digite apenas 1 ou 2");
            resposta = sc.nextInt();

        }


    }

    System.out.printf("Nome: " + produto.name + "%nValor: " + produto.price + "%nQuantidade: " + produto.quantity +"%n");
    System.out.printf("valor total em estoque: ");
    System.out.println(produto.valorTotalnoEstoque());




    sc.close();
    }



}
