package orders;

import client.Client;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
    private Date momment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> orderItems = new ArrayList<OrderItem>();

    public Order(){

    }

    public Order(Date momment, OrderStatus status, Client client){
        super();
        this.momment = momment;
        this.status = status;
        this.client = client;
    }

    public void setMomment(Date momment){
        this.momment = momment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMomment(){
        return momment;
    }

    public OrderStatus getStatus(){
        return status;
    }

    public Client getClient() {
        return client;
    }
    // 3 opções, remove o get da lista, faz uma cópia segura da lista,
    // maneira de encapsular

/*    public List<OrderItem> getOrderItems(){
        return orderItems;
    }*/

    public void addItem(OrderItem orderItem){
        orderItems.add(orderItem);
    }

    public void removeItem(OrderItem orderItem){
        orderItems.remove(orderItem);
    }

    public double total(){
        double total = 0.0;
        for (OrderItem c : orderItems){
            total += c.subTotal();
        }
        return total;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order momment: " + sdf.format(momment));
        sb.append("\n");
        sb.append("Order Status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items:\n");
        for(OrderItem it : orderItems){
            sb.append(it + "\n");
        }
        sb.append("Total price: " + String.format("%.2f",total()));
        return sb.toString();
    }
}
