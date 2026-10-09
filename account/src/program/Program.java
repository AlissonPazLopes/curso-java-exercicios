package program;

import account.Account;
import account.BusinessAccount;
import account.SavingsAccount;

public class Program {
    public static void main(String [] args){

        Account acc = new Account("Alisson", 129, 0.0);
        BusinessAccount bsa = new BusinessAccount("Emilly", 130, 0.0, 500.0);

        //UPCASTING:
        Account acc1 = bsa;
        Account acc2 = new BusinessAccount("Jose", 140, 0.0,200.0);
        Account acc3 = new SavingsAccount("Paz", 141, 0.0, 0.3);


        //DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100.0);

        if(acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(500);
            System.out.println("Loan");
        }

        if(acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");

        }





    }
}
