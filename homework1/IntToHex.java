/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;
import java.util.Scanner;
/**
 *
 * @author Shannen Barrameda
 */
public class IntToHex {
    public static String hexadecimal = "";
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int number = 0;
        
        //Prompts user to enter an integer for conversion then calls convert method to convert int to hex
        //prints once convert method is called
        System.out.println("Enter an integer to convert it to hexadecimal: ");
        number = input.nextInt();
        System.out.println(number + " is " + convert(number) + " in hexadecimal.");
    }
    
    public static String convert(int number){
        //Divides and modulo 16 to use the remainders of the number in the reverse order
        //results in hexadecimal number of integer
        if(number != 0){
           convert(number/16);
           switch(Math.abs(number%16)){
           case 0:
               hexadecimal += "0";
               break;
           case 1: 
               hexadecimal += "1";
               break; 
           case 2:
               hexadecimal += "2";
               break;
           case 3: 
               hexadecimal += "3";
               break;
           case 4: 
               hexadecimal += "4";
               break;
           case 5: 
               hexadecimal += "5";
               break;
           case 6: 
               hexadecimal += "6";
               break;
           case 7: 
               hexadecimal += "7";
               break;
           case 8: 
               hexadecimal += "8";
               break;
           case 9: 
               hexadecimal += "9";
               break;
           case 10: 
               hexadecimal += "A";
               break;
           case 11: 
               hexadecimal += "B";
               break;
           case 12: 
               hexadecimal += "C";
               break;
           case 13: 
               hexadecimal += "D";
               break;
           case 14: 
               hexadecimal += "E";
               break;
           case 15: 
               hexadecimal += "F";
               break;
            }
            
        }
        else {
           hexadecimal += "";
        }
        
        //hexadecimal forma
          return "0x" + hexadecimal;
      
    }
}
    

