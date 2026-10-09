package account;

public class BusinessAccount extends Account{

    private Double loanLimit;

    public BusinessAccount(){
        super();
    }

    public BusinessAccount(String holder,Integer number, Double balence, Double loanLimit){
        super(holder, number, balence);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if(amount <= loanLimit) {
            balence = amount - 10;

        }
    }

}
