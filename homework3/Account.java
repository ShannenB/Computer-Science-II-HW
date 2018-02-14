
package homework3;

/**
 *
 * @author Shannen Barrameda sib170130
 */
public class Account { //parent class of savingsaccount and checking account classes
    protected double balance, beginningBalance;
    protected int num_deposits;
    protected int num_withdrawals;
    protected double annual_interest_rate;
    protected double service_charges;
    
    public Account(double balance, double interest_rate){
        this.balance = balance;
        beginningBalance = balance;
        this.annual_interest_rate = interest_rate;
    }
    
    public void deposit(double amount){
        num_deposits++;                                                         
        balance += amount;
    }
    
    public void withdraw(double amount){
        num_withdrawals++;
        balance -= amount;
    }
    
    public void calcInt(){
        double monthly_interest_rate = annual_interest_rate /12;
        double monthly_interest = balance * monthly_interest_rate;
        balance = balance + monthly_interest;
    }
    
    public void monthlyProc(){
        balance -= service_charges;                                             //subtracts charges at the end of the month
        
        calcInt();                                                              //adds interest at the end of the month
        System.out.printf("Beginning Balance - %.2f\t Ending Balance - %.2f\t Number of Deposits %s\t"
                + "Number of Withdrawals - %s\t Service Charges - %.2f\t", beginningBalance, balance, num_deposits, num_withdrawals, service_charges);
      
        num_withdrawals = 0;
        num_deposits = 0;
        service_charges = 0;
    }
    
    
}
