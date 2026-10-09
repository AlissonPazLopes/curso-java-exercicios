package main;

import banco.Operacao;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.printf("Enter account number: ");
        int numerodaconta = sc.nextInt();
        Operacao accounte;


        System.out.printf("%n");

        System.out.printf("Enter account Holder: ");
        String holder;
        sc.nextLine();
        holder = sc.nextLine();
        System.out.printf("%n");
        System.out.printf("Is there a initial deposit (y/n)? ");
        String resposta;
        resposta = sc.nextLine();
        System.out.printf("%n");

        if (resposta.equals("y")){
            System.out.printf("Enter initial deposit value: ");
            double valorDeposito = sc.nextDouble();
            accounte = new Operacao(numerodaconta, holder, valorDeposito);
            accounte.operacaoDeposito(valorDeposito);
            accounte.toString();


        } else {

            accounte = new Operacao(numerodaconta, holder);
            accounte.toString();

        }




        System.out.printf("Account data: ");
        System.out.printf("Account " + accounte.getAccount() + "," + " Holder " + accounte.getName()+ "," + " Balance: " + accounte.getInitialvalue() + "%n");

        System.out.printf("%nDigite y se deseja realizar mais alguma operação: ");
        String resposta2 = sc.nextLine();

        while(resposta2.equals("y")){

            System.out.println("Se a operação for saque digite 1");
            System.out.println("Se a operação for deposito digite 2");
            System.out.println("Se a operação for para trocar o nome digite 3");
            int escolhaoperacao = sc.nextInt();

            while(escolhaoperacao != 1 && escolhaoperacao != 2 && escolhaoperacao != 3){
                System.out.println("Digite uma opcão válida: (1,2,3)");
                escolhaoperacao = sc.nextInt();

            }

            if (escolhaoperacao == 1){
                System.out.println("Digite o valor a ser sacado: ");
                double saque = sc.nextDouble();
                if(saque > 0) {
                    if (saque < accounte.getInitialvalue()) {
                        accounte.operacaoSaque(saque);
                        System.out.printf("Account " + accounte.getAccount() + "," + " Holder " + accounte.getName()+ "," + " Balance: " + accounte.getInitialvalue() + "%n");
                    }
                    else if(saque == accounte.getInitialvalue()){
                        accounte.operacaoSaque(saque);
                        System.out.printf("Account " + accounte.getAccount() + "," + " Holder " + accounte.getName()+ "," + " Balance: " + accounte.getInitialvalue() + "%n");

                    }

                    else{
                        System.out.printf("%nSaldo insuficiente%n");
                        System.out.printf("Account " + accounte.getAccount() + "," + " Holder " + accounte.getName()+ "," + " Balance: " + accounte.getInitialvalue() + "%n");

                    }

                }
                else{
                    System.out.printf("%nVocê não consegue sacar valores em zero ou negativo!");
                    System.out.printf("Account " + accounte.getAccount() + "," + " Holder " + accounte.getName()+ "," + " Balance: " + accounte.getInitialvalue() + "%n");
                }
            }

            else if(escolhaoperacao == 2){
                System.out.printf("Enter initial deposit value: ");
                double valorDeposito = sc.nextDouble();
                accounte.operacaoDeposito(valorDeposito);
                System.out.printf("Account " + accounte.getAccount() + "," + " Holder " + accounte.getName()+ "," + " Balance: " + accounte.getInitialvalue() + "%n");

            }

            else if (escolhaoperacao == 3){
                System.out.println("Digite o novo nome: ");
                sc.nextLine();
                String nomenovo = sc.nextLine();
                accounte.setName(nomenovo);
                System.out.printf("Account " + accounte.getAccount() + "," + " Holder " + accounte.getName()+ "," + " Balance: " + accounte.getInitialvalue() + "%n");

            }

            System.out.println("Deseja continuar com as operações? (y/n)");

            sc.nextLine();
            resposta2 = sc.nextLine();


        }

        System.out.println("FIM");





        sc.close();

    }
}
