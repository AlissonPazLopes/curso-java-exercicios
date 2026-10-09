package account;

public class Account {
    private Integer number;
    private String holder;
    protected Double balence;

    public Account(){

    }


    public Account(String holder, Integer number, Double balence) {
        this.holder = holder;
        this.number = number;
        this.balence = balence;
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalence() {
        return balence;
    }

    public void withdraw(double amount){
        balence = balence - amount;
    }
    public void deposit(double amount){
        balence = balence + amount;
    }




}
