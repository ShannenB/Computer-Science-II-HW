//Shannen Barrameda sib170130
package homework4.Part1;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) throws BinaryFormatException{
            Scanner input = new Scanner(System.in);
            String binary = "";
            
            System.out.println("Type in a binary string to convert it: ");
            binary = input.nextLine();
            
            try{
                if(isValid(binary)){
                    System.out.println(binary + " in decimal is " + isValid(binary));
                }
                else
                    throw new BinaryFormatException("Incorrect binary format");
            }
            catch(BinaryFormatException ex){
                System.out.println(ex.toString());   
            }
        }
        
        public static int bin2Dec(String str){
            int decimal = 0;
            for(int i = 0; i < str.length(); i++){
                if(str.substring(i, i+1).equals("1"))
                {
                    decimal += Math.pow(2,str.length()-i-1);
                }
            }
            return decimal;
        }
        
        private static boolean isValid(String str){
            boolean valid = false;
            
            for(int i = 0; i < str.length(); i++){
                if(str.substring(i, i+1).equals("1") || str.substring(i, i+1).equals("0")){
                    valid = true;
                }
                else
                    valid = false;
            }
            
            return valid;
        }

    
}
