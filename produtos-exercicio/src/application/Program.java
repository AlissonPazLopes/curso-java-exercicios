package application;

import client.Client;
import orders.Order;
import orders.OrderItem;
import orders.OrderStatus;
import products.Product;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String [] args) throws ParseException {


        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");


        Product p1 = new Product("TV", 1000);
        Product p2 = new Product("Mouse",1000);
        System.out.println(p1);

        OrderItem oi1 = new OrderItem(1,1000, p1);
        OrderItem oi2 = new OrderItem(4,400, p2);



        Client cli = new Client("Jose Alisson", "alisson@gmail.com", sdf1.parse("04/03/2006"));
        System.out.println(cli);
        System.out.println(oi1);

        Order order = new Order(new Date(), OrderStatus.PROCESSING, cli);
        order.addItem(oi1);
        order.addItem(oi2);

        System.out.println(order);


    }

}
