/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

/**Download the the salary file from http://cs.armstrong.edu/liang/data/Salary.txt. Each line
 * in the file consists of a faculty member’s first name, last name, rank, and salary.  Write
 * a program to display the total salary for assistant professors, associate professors, full
 * professors, and all faculty, respectively, and display the average salary for assistant professors,
 * associate professors, full professors, and all faculty, respectively.
 *
 * @author Shannen Barrameda
 */
public class Salary {
   public static void main(String[] args) throws IOException{
       URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt");
       Scanner input = new Scanner(url.openStream());
       double associate_sum = 0, assistant_sum = 0, full_sum = 0, total_sum = 0;
       int associate_num = 0, assistant_num = 0, full_num = 0;
       final int TOTAL_NUM = 1000;
       
    
       //iterates throuh each line to parse the salary values for each professor depending on their rank
       //sums each salary
       while(input.hasNext()){
           String str = input.nextLine();
           if(str.contains("assistant")){
               int firstIndex = str.indexOf("istant");
               associate_sum += Double.parseDouble(str.substring(firstIndex + 7));
               associate_num++;
           }     
           else if(str.contains("ociate")){
               int firstIndex = str.indexOf("ociate");
               assistant_sum += Double.parseDouble(str.substring(firstIndex + 7));
               assistant_num++;       
           }
           else if(str.contains("full")){
               int firstIndex = str.indexOf("full");
               full_sum += Double.parseDouble(str.substring(firstIndex + 5));
               full_num++; 
           }  
       }
         
         total_sum = associate_sum + assistant_sum + full_sum;
         
       
         System.out.printf("The total salary for the associate professors is: $%.2f\n", associate_sum);
         System.out.print("The average salary for the associate professors is: ");
         averageSalary(associate_sum, associate_num);
         
         System.out.printf("The total salary for the assistant professors is: $%.2f\n", assistant_sum);
         System.out.print("The average salary for the assistant professors is: ");
         averageSalary(assistant_sum, assistant_num);
         
         System.out.printf("The total salary for the full-time professors is: $%.2f\n", full_sum);
         System.out.print("The average salary for the full-time professors is: ");
         averageSalary(full_sum, full_num);
         
         System.out.printf("The total salary for the faculty members is: $%.2f\n",total_sum);
         System.out.print("The average salary for all faculty members is: ");
         averageSalary(total_sum, TOTAL_NUM);
       
   
   
   } 
   //finds average of each salary
   public static void averageSalary(double employee_sum, int employee_num){
       double average = employee_sum/employee_num;
       
       System.out.printf("$%.2f\n\n", average);
   }
}
