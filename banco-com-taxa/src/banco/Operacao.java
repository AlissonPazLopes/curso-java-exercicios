package banco;
// saldo so pode ser alterado via deposito ou retirada que sao 2 funcoes - feito
// numero da conta nao muda - feito
// nome da pessoal pode mudar
// o saque cobra uma taxa de 5 reias a cada saque.
// se o saldo for insuficiente para pagar a taxa a conta fica com saldo negativo



public class Operacao {


    private int account;
    private String name;
    private double initialvalue;


    public Operacao(){
    }





    public Operacao(int account, String name){

        this.account = account;
        this.name = name;

    }


    public Operacao(int account, String name, double initialvaluer){
        this.account = account;
        this.name = name;
        operacaoDeposito(initialvaluer);
    }


    public double operacaoSaque(double retirada){
        this.initialvalue = (this.initialvalue - retirada) - 5;
        return this.initialvalue;
    }


    public double operacaoDeposito(double deposito){
        this.initialvalue = this.initialvalue + deposito;

        return this.initialvalue;
    }


    public int getAccount() {
        return account;

    }


    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public double getInitialvalue(){
        return initialvalue;
    }

    public String toString(){
        return "Account " + account + "," + " Holder " + name + "," + String.format("Balance: %.3f", initialvalue);
    }

}
