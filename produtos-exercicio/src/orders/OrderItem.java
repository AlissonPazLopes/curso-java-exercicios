package orders;

import products.Product;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;


    public OrderItem(){

    }

    public OrderItem(Integer quantity, double price, Product product){
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public void setQuantity(Integer quantity){
        this.quantity = quantity;

    }

    public void setPrice(double price){
        this.price = price;


    }

    public Integer getQuantity(){
        return quantity;
    }

    public double getPrice(){
        return price;

    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subTotal(){
        return quantity * price;
    }


    public String toString(){

        return "produto: "+ product.getName() + " quantidade: " + quantity + " price: " + price + " valor total: "+ String.format("%.2f", subTotal()) +"\n";

    }
}
