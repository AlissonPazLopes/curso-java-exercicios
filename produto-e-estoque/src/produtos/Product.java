package produtos;

public class Product {
    public String name;
    public double price;
    public int quantity;
    public int remover, adicionar;


    public double valorTotalnoEstoque(){
        return price * quantity;
    }

    public  int adicionarProdutos(int quantidade){
        this.quantity = this.quantity + quantidade;
        return this.quantity;
    }

    public int removerProdutos(int quantidade){
        this.quantity = this.quantity - quantidade;

        return this.quantity;
    }

    public String toString(){
        return name;
    }


}
