package homework3;

/**
 *
 * @author Shannen Barrameda    sib170130
 */
public class CheckingAccount extends Account {
    public double amountOwed = 0;

    public CheckingAccount(double balance, double interest_rate) {
        super(balance, interest_rate);
       
    }
    
    public void withdraw(double amount){
        double newBalance = this.balance - amount;
        
        if(newBalance < 0){                                                     //negative accounts are charged with a $15 fee
            this.service_charges += 15;
        } 
        else
            super.withdraw(amount);
        
        double withCharge = this.balance - this.service_charges;
        
        if(withCharge < 0){                                                     //if accounts with fees subtracted are negative, user owes amount
            amountOwed = Math.abs(newBalance);
            System.out.println("Withdrawal declined. Balance of your checking account is now negative. You owe " +  amountOwed);
        }
        
    }
    
    public void monthlyProc(){                                                  //gives monthly stats and calculates service charges
        super.service_charges = 5 + .1*this.num_withdrawals;
       
        
        super.monthlyProc();
        
        
        
        
    }
        
}
