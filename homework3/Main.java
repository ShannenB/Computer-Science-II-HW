package homework3;
import java.util.Scanner;

/**
 *
 * @author Shannen Barrameda
 */
public class Main {
    public static void main(String[] args){
    
    double amount_deposits, amount_withdrawal;
    double beginningBalance_s, beginningBalance_c, interest_rate_s, interest_rate_c;
    boolean user = true;
    
    Scanner input = new Scanner(System.in);
    
    
    System.out.println("Enter the beginning balance for your savings account:  ");                  //Request balance and interest rate from user
        beginningBalance_s = input.nextDouble();
    System.out.println("Enter the annual interest rate of your savings accountas a decimal (i.e. if it is 8%, type in .08):  ");
        interest_rate_s = input.nextDouble();
        
    System.out.println("Enter the beginning balance for your checking account:  ");
        beginningBalance_c = input.nextDouble();
    System.out.println("Enter the annual interest rate of your checking account as a decimal (i.e. if it is 8%, type in .08):  ");
        interest_rate_c = input.nextDouble();
        
    
    SavingsAccount savings = new SavingsAccount(beginningBalance_s, interest_rate_s);               //Create respective accounts with given info
    CheckingAccount checking = new CheckingAccount(beginningBalance_c, interest_rate_c);
    
    while(user){
        System.out.println("Would you like to make a deposit or a withdrawal? Type D for Deposit or W for Withdrawal. "
                + "Type any other key to end: ");
        String response = input.next();
        
        if(response.equals("D") || response.equals("d")){                                           //Continues to ask user what account to make transaction as long as no other keys than D or Wis pressed
                System.out.println("Which account would you like to do the transaction? Type S for Savings or C for Checking: ");
                    String account = input.next();
                System.out.println("Enter amount you would like to deposit:  ");
                    amount_deposits = input.nextDouble();                                           //Deposits in appropriate account
                if(account.equals("S") || account.equals("s")){
                    savings.deposit(amount_deposits);
                }
                else if(account.equals("C") || account.equals("c")){
                    checking.deposit(amount_deposits);
                } 
                  
        }
        else if(response.equals("W") || response.equals("w")){
                System.out.println("Which account would you like to do the transaction? Type S for Savings or C for Checking: ");
                    String account = input.next();
                System.out.println("Enter amount you would like to withdraw:  ");
                    amount_withdrawal = input.nextDouble();                                         //Withdraws from appropriate account
                if(account.equals("S") || account.equals("s")){
                    savings.withdraw(amount_withdrawal);
                }
                else if(account.equals("C") || account.equals("c")){
                    checking.withdraw(amount_withdrawal);
                }
        }
        else 
            user = false;
    }

    System.out.println("Savings Account:");
    savings.monthlyProc();                                                                           //Gives monthly statistics
    
    
    System.out.println("\nChecking Account: ");
    checking.monthlyProc();

    
    
    }

    
    
    
    
}
