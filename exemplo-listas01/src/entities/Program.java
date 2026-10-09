package entities;

import funcionarios.Funcionario;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.printf("Quantas pessoas você quer cadastrar? ");
        int quantidade = sc.nextInt();
        System.out.printf("%n");
        List<Integer> Id = new ArrayList<>();
        Funcionario[] func = new Funcionario[quantidade];


        if (quantidade > 0) {
            for (int i = 0; i < quantidade; i++) {
                System.out.printf("Digite o nome do(a) %d funcionario(a): ", i+1);
                sc.nextLine();
                String nome = sc.nextLine();

                System.out.printf("Digite o ID do(a) funcionario(a): ");
                int idfunc = sc.nextInt();

                System.out.printf("Digite o salario do(a) funcionario(a): ");
                double salary = sc.nextDouble();
                System.out.printf("%n");

                func[i] = new Funcionario(idfunc, nome, salary);
                Id.add(idfunc);
            }
        } else {
            System.out.printf("%nDigite uma quantidade válida!");
        }

        System.out.printf("Digite o id do(a) funcionario(a) que você vai aumentar o salário: ");
        int id = sc.nextInt();
        int posicao = Id.indexOf(id);


        System.out.printf("Digite a porcentagem que você vai adicionar no salário: ");
        double porcetagem = sc.nextDouble();

        for(int i = 0; i < quantidade; i++){
            if(i == posicao){
                double aumento = func[i].getSalary();
                aumento = ((aumento * porcetagem) / 100) + aumento ;
                func[i].setSalary(aumento);
                System.out.printf("Salario: %.2f", func[i].getSalary());
            }
        }



    }
}










// o que eu errei


/*
package entities;

import funcionarios.Funcionario;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> lista = new ArrayList<>();

        System.out.print("Quantas pessoas você quer cadastrar? ");
        int quantidade = sc.nextInt();
        System.out.println();

        for (int i = 0; i < quantidade; i++) {
            System.out.printf("Digite o nome do(a) %d funcionario(a): ", i + 1);
            sc.nextLine(); // Limpa buffer pendente do nextInt()
            String nome = sc.nextLine();

            System.out.print("Digite o ID do(a) funcionario(a): ");
            int id = sc.nextInt();

            System.out.print("Digite o salario do(a) funcionario(a): ");
            double salary = sc.nextDouble();
            System.out.println();

             Adiciona o objeto completo diretamente na lista
            lista.add(new Funcionario(id, nome, salary));
        }

        System.out.print("Digite o ID do(a) funcionario(a) que você vai aumentar o salário: ");
        int idAumento = sc.nextInt();

         Busca o funcionário pelo ID diretamente dentro dos objetos da lista
        Funcionario funcAlvo = null;
        for (Funcionario f : lista) {
            if (f.getId() == idAumento) {
                funcAlvo = f;
                break;
            }
        }

        if (funcAlvo == null) {
            System.out.println("Este ID não existe!");
        } else {
            System.out.print("Digite a porcentagem que você vai adicionar no salário: ");
            double porcentagem = sc.nextDouble();

             Chama o método próprio da classe Funcionario
            funcAlvo.aumentoSalarial(porcentagem);

            System.out.printf("Novo salário: %.2f%n", funcAlvo.getSalary());
        }

        sc.close();
    }
}*/
