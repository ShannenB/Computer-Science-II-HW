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
public class MeanStandardDeviation {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        final int NUMBER_OF_DIGITS = 10;
        double sum_1 = 0, sum_2 = 0, inputNum = 0;
        double numeratorForStandardDeviation = (sum_2 - Math.pow(sum_1,2)/NUMBER_OF_DIGITS );
        double standardDeviation = 0;
        double mean = 0;
  
        System.out.println("Enter ten numbers with spaces in between (e.g. 1 2 3 ...): ");
 
        //Calculate sigma(x^2) and (sigma(x))^2 given input values
        for(int i = 0; i < NUMBER_OF_DIGITS; i++){
          inputNum = input.nextDouble();
          sum_1 += inputNum;
          sum_2 += Math.pow(inputNum,2);           
        } 
        
        //Calculate mean by adding all of the digits then dividing by the number of digits
        mean = sum_1 / NUMBER_OF_DIGITS;
       
        //Calculate numerator for standard deviation sigma(x^2) - ((sigma(x))^2/n)
        numeratorForStandardDeviation = (sum_2 - Math.pow(sum_1,2)/NUMBER_OF_DIGITS );
       
        //Calculate standard deviation using the equation sqrt(sigma((x-mean)^2)/(n-1))
        standardDeviation = Math.sqrt(numeratorForStandardDeviation/(NUMBER_OF_DIGITS - 1));       
        
        System.out.println("The mean of the ten numbers is: " + mean);
        System.out.println("The standard deviation of the ten numbers is: " + standardDeviation);
     
    }   

}         
