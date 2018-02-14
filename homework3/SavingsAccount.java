package homework3;

/**
 *
 * @author Shannen Barrameda    sib170130
 */
public class SavingsAccount extends Account{
    
    private boolean status; //where true is active and false is inactive
      
    public SavingsAccount(double balance, double interest_rate) {
        super(balance, interest_rate);
        
        if(balance < 25)
            status = false;
    }
    
    public void withdraw(double amount){
        if(this.status == true){                                                //checks for status of account; only withdraws if acct is active
            super.withdraw(amount);
        }
        else
             System.out.println("Withdrawal declined. Your account is now inactive.");
    }
    
    public void deposit(double amount){                                         //accounts with deposits that will cause account to go over 25 are made active
        double newBalance = this.balance + amount;
        if((this.status == false) && newBalance > 25){
            status = true;
            System.out.println("Your account is active again.");
        }
        
        
        super.deposit(amount);
    }
    
    public void monthlyProc(){
        if(this.num_withdrawals > 4){
            super.service_charges = this.num_withdrawals - 4;                   //service charges are calculate; one for every withdrawal made on account above 4
        }
        
        super.monthlyProc();
              
        if(this.balance < 25){
            status = false;
        }
    }
}
