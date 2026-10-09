package produtos;

public class Product {
    private String vectorName;
    private double vectorPrice;

    public Product(String vectorName, double vectorPrice){

        this.vectorName = vectorName;
        this.vectorPrice = vectorPrice;


    }


    public String getVectorName() {
        return vectorName;
    }

    public void setVectorName(String vectorName) {
        this.vectorName = vectorName;
    }

    public double getVectorPrice() {
        return vectorPrice;
    }

    public void setVectorPrice(double vectorPrice) {
        this.vectorPrice = vectorPrice;
    }
}
