/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework2;
import java.util.Scanner;

/**
 *
 * @author Shannen Barrameda
 */
public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
            
       //prompts user to enter first 3x3 matrix to store into 2D array
        System.out.println("Enter your first 3x3 matrix with spaces in between each integer: ");
       
        
        for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                matrix1[row][col] = input.nextInt(); 
            }
        }
        
        
        
        //prompts user to enter second 3x3 matrix to store into 2D array
        System.out.println("Enter your second 3x3 matrix with spaces in between each integer: ");
         for (int row = 0; row < 3; row++){
            for (int col = 0; col < 3; col++){
                matrix2[row][col] = input.nextInt(); 
            }
        }
         
        

        System.out.println("The product of "); 
        printMatrix(matrix1);
        System.out.println("and ");
        printMatrix(matrix2); 
        System.out.println("is ");
        printMatrix(multiply(matrix1,matrix2));
    }
    
    //prints matrix in 3x3 format
    public static void printMatrix(int[][] matrix){
        for(int row = 0; row < matrix.length; row++){
            for(int col =0; col < matrix.length; col++){
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
    
    //calculates product of two matrices
    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        int[][] result = new int[3][3];
        
        for(int row = 0; row < 3; row++){
            for(int col = 0; col < 3; col++){
                for(int i = 0; i < 3; i++){
                        result[row][col] += matrix1[row][i]*matrix2[i][col];
                    }
//                    result[row][col] += matrix1[row][0]*matrix2[0][col] +  
//                            matrix1[row][1]*matrix2[1][col] + 
//                            matrix1[row][2]*matrix2[2][col] ;
                 }
                
            }

        return result;
    }
}
    

