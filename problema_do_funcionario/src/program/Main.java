package program;

import funcionario.Funcionario;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();


        System.out.println("Nome do funcionario: ");
        funcionario.nome = sc.nextLine();
        System.out.println("Salario bruto do funcionario: ");
        funcionario.salaryBrute = sc.nextDouble();
        System.out.println("Digite o imposto sobre o funcionário: ");
        funcionario.tax = sc.nextDouble();


        System.out.printf("Nome: %s,",funcionario.nome);
        System.out.printf("%.3f%n",funcionario.calcularSalario());
        String escolha;
        System.out.println("Deseja adicionar uma porcentagem no salário? s/n");
        sc.nextLine();
        escolha = sc.nextLine();

        if (escolha.equals("s")){
            double porcentagem;
            System.out.println("Digite a porcentagem: ");
            porcentagem = sc.nextDouble();
            System.out.printf("Aumento implementado, Salário atual: %.2f%n", funcionario.aumentoPercentual(porcentagem));


        }


        System.out.println("FIM");

    }




}
