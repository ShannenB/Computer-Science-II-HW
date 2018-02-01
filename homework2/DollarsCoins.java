/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;
import static java.lang.Integer.parseInt;
import java.util.Scanner;
/**
 *Write a program to calculate the cents and coins to return to a customer.  
 * Read the input as a string such as "11.56". Your program should extract the dollar amount before
 * the decimal point and the cents after the decimal amount using the indexOf and substring methods.  
 * Display a formatted chart identifying which bills and coins the user will receive.
 * @author Shannen Barrameda
 */
public class DollarsCoins {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String change = "";
        String cash = "";
        String coin = "";
        
        int dollars = 0;
        int cents = 0;
        
        //prompts user to enter how much change to return to the customer
        System.out.println("Enter how much to return to the customer such as \"11.56\": ");
        change = input.next();
        
        //finds index of the decimal point to extract dollar amount before decimal point and cents after decimal point
        if(change.indexOf(".") == -1){
            cash = change.substring(0,change.length());
            coin = "00";   
        }
        else{
            cash = change.substring(0,change.indexOf("."));
            coin = change.substring(change.indexOf(".") + 1,change.length()); 
        }
        
        //parses string extracted from user prompt to convert dollar and cent amounts to integers for math
        findDollars(parseInt(cash));
        findCents(parseInt(coin));
    }
    
    //calculates how many of each bill is needed
    public static void findDollars(int dollars){
        int one_hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int one = 0;
        
        if(dollars/100 != 0){
           one_hundred = dollars/100;
           dollars%=100;    
        }
        if(dollars/50 != 0){
            fifty = dollars/50;
            dollars%=50;
        }
        if(dollars/20 != 0){
            twenty = dollars/20;
            dollars%=20;
        }
        if(dollars/10 != 0){
            ten = dollars/10;
            dollars%=10;
        }
        if(dollars/5 != 0){
            five = dollars/5;
            dollars%=5;
        }
        one = dollars;
        
        //prints type of bills and number of bills in tabular format
        System.out.printf("\nBILLS \t\t NUMBER\none hundred: %8d\nfifty: %14d\ntwenty: %13d\nten: %16d\nfive: %15d\none: %16d\n",
                one_hundred, fifty, twenty, one, ten, five, one);
              
    }
    
    public static void findCents(int cents){
        int quarter = 0;
        int half_dollar = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        
        if(cents/50 != 0){
            half_dollar = cents/50;
            cents%=50;
        }
        if(cents/25 != 0){
           quarter = cents/25;
           cents%=25;
        }
        if(cents/10 != 0){
            dime = cents/10;
            cents%=10;
        }
        if(cents/5 != 0){
            nickel = cents/5;
            cents%=10;
        }
        
        penny = cents;
        
        //prints type of coins and number of coins in tabular format
        System.out.printf("\nCOINS \t\t NUMBER\nhalf dollar: %8d\nquarter: %12d\ndime: %15d\nnickel: %13d\npenny: %14d\n",
                half_dollar, quarter, dime, nickel, penny);
    }
}
