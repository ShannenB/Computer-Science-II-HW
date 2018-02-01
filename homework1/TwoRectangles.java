/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework1;
import java.util.Scanner;
import java.awt.Rectangle;

/**
 *
 * @author Shannen Barrameda
 */
public class TwoRectangles {
    public static void main(String[] args){
       int height1, width1, height2, width2;
       int x1, y1, x2,y2;
      
       Scanner input = new Scanner(System.in);
       
       //Prompts user to enter coordinates, height, and width of first rectangle
       System.out.println("Enter the first rectangle's center coordinates (x,y) as integers x y: ");
       x1 = input.nextInt();
       y1 = input.nextInt();
       
       System.out.println("Enter the first rectangle's height as an integer: ");
       height1 = input.nextInt();
       System.out.println("Enter the first rectangle's width as an integer: ");
       width1 = input.nextInt();
       
        //Prompts user to enter coordinates, height, and width of second rectangle
       System.out.println("Enter the second rectangle's center coordinates (x,y) as integers x y: ");
       x2 = input.nextInt();
       y2 = input.nextInt();
       
       System.out.println("Enter the second rectangle's height as an integer: ");
       height2 = input.nextInt();
       System.out.println("Enter the second rectangle's width as an integer: ");
       width2 = input.nextInt();
       
       //Creates rectangle objects with user input
       Rectangle rectangle1 = new Rectangle(x1,y1,width1,height1);
       Rectangle rectangle2 = new Rectangle(x2,y2,width2, height2);
       
       //compares rectangle 1 to rectangle 2 for overlap, containment, or neither
       if(rectangle1.contains(rectangle2)){
           System.out.println("rectangle 1 contains rectangle 2.");
       }
       else if(rectangle1.intersects(rectangle2)){
           System.out.println("rectangles overlap.");
       }
       else
           System.out.println("rectangles don't overlap. rectangle 2 is not inside rectangle 1");
    }
}
