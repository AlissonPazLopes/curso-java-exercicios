import java.util.Locale;
import java.util.Scanner;

public class Program{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        //problema do triangulo:
        // area = raizquadrada de p(p-a)(p-b)(p-)c
        //onde p é a+b+c / 2

        System.out.println("Digite o valor dos lados do primeiro Triangulo:");
        System.out.println("Valor de a: ");
        double x = sc.nextDouble();
        System.out.println("Valor de b: ");
        double y = sc.nextDouble();
        System.out.println("Valor de c: ");
        double z = sc.nextDouble();

        System.out.println("Digite o valor dos lados do segundo Triangulo:");
        System.out.println("Valor de a: ");
        double a = sc.nextDouble();
        System.out.println("Valor de b: ");
        double b = sc.nextDouble();
        System.out.println("Valor de c: ");
        double c = sc.nextDouble();

        double p1= (x+y+z) / 2.0 ;
        double semiarea1 = (p1 * (p1-x) * (p1-y) * (p1-z)) ;
        double area1 = Math.sqrt(semiarea1);


        double p2 = (a+b+c) / 2.0 ;
        double semiarea2 = (p2 * (p2-a) * (p2-b) * (p2-c)) ;
        double area2 = Math.sqrt(semiarea2);


        if (area1 > area2){
            System.out.printf("Triangulo1 : ");
            Printf(area1);
        }
        else if (area2 > area1){
            System.out.println("Triangulo1 : ");
            Printf(area2);
        }
        else{
            System.out.println("Os dois tem a mesma area");
        }


    }

    public static void Printf(double triangulo){
        Scanner sc = new Scanner(System.in);
        double aux = triangulo;
        System.out.printf("A area do triangulo é: %.2f%n", aux);


    }

}