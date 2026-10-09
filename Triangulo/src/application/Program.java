package application;

import entites.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {



    public static void main(String[] args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);


    Triangle triangle1, triangle2;
    triangle1 = new Triangle();
    triangle2 = new Triangle();


    System.out.println("Digite os valores do primeiro triangulo: ");
    triangle1.a = sc.nextDouble();
    triangle1.b = sc.nextDouble();
    triangle1.c = sc.nextDouble();


    System.out.println("Digite os valores do triangulo");
    triangle2.a = sc.nextDouble();
    triangle2.b = sc.nextDouble();
    triangle2.c = sc.nextDouble();


    double area1 = triangle1.area();
    double area2 = triangle2.area();


    System.out.printf("Valor da area do triangle1: %.2f%n",area1);
    System.out.printf("Valor da area do triangle1: %.2f%n",area2);

    if(area1 > area2){
        System.out.println("A area do triangulo1 é maior");
    }
    else if(area1 < area2){
        System.out.println("A area do triangulo2 é maior");
    }   else {
        System.out.println("Os triangulo possuem areas iguais!");
    }



    }




}
