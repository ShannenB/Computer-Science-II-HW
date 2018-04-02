package homework5;
import java.io.*;
import static java.lang.Character.toUpperCase;


public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException{
        File file1 = new File("fileIn.txt");
        File file2 = new File("results.txt");
        File file3 = new File("fileIn2.txt");
        char ch;

        //reverseOrderStack(file1,file2);
        //uppercaseQueue(file1,file2);
        //System.out.print(identicalQueues(file1, file3));

        
       
    }
    
    public static void reverseOrderStack(File file1, File file2) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(
          new FileInputStream(file1), "US-ASCII"));
        PrintWriter output = new PrintWriter(file2);
        
        SimpleStack stack = new SimpleStack();
        char ch;
        if(file1.canRead() && file2.canWrite()){
            while( br.ready()){                                                 //while stream has not ended
                if((ch = (char)br.read()) != -1)  
                 stack.add(ch);                                                 //add each character to stack
            }
            int size = stack.getSize();
            
            for(int i = 0; i < size ; i++){                                      //puts characters into file in the reverse order
                output.print(stack.remove());
            }
        }
       
        output.close();
        br.close();
    }
    
    public static  void uppercaseQueue(File file1, File file2) throws FileNotFoundException, IOException{
        BufferedReader br = new BufferedReader(new FileReader(file1));
        PrintWriter output = new PrintWriter(file2);
        SimpleQueue queue = new SimpleQueue();
        
        char ch, input;
        if(file1.canRead() && file2.canWrite()){
            while(br.ready()){                                                                  
                if((ch = (char)br.read())!= -1)                                 //while stream has not ended
                    queue.enqueue(ch);                                              //add each character to queue
            }
            
            int size = queue.getSize();
                
            for(int i = 0; i < size; i++){                                      //converts each character in queue to uppercase
                input = toUpperCase(queue.dequeue());                           //outputs each character to approrpiate file in uppercase format
                output.print(input);
            }
        }
        output.close();
        br.close();
    }
    
    public static String identicalQueues(File file1, File file2) throws FileNotFoundException, IOException{
        SimpleQueue queue1 = new SimpleQueue();
        SimpleQueue queue2 = new SimpleQueue();
        BufferedReader br1 = new BufferedReader(new FileReader(file1));
        BufferedReader br2 = new BufferedReader(new FileReader(file2));
        char ch1, ch2;
        boolean identical = true;
        
        while(br1.ready()){
            if((ch1 = (char)br1.read()) != -1)
                queue1.enqueue(ch1);                                                    //queues each character in the first file   
        }
        while(br2.ready()){
            if((ch2 = (char)br2.read()) != -1)                                  //queues each character in second file
                queue2.enqueue(ch2);
        }
        
        br1.close();
        br2.close();
        
        int size1 = queue1.getSize();
        int size2 = queue2.getSize();
        if(size1 != size2){                                                     //compares size of file; immediately file is not identical if
            identical = false;                                                  //number of characters is different
        }
        else{
            for(int i = 0; i < size1; i++){
                if(queue1.dequeue() != queue2.dequeue()){                       //compres each character from each queue (i.e. file)
                    identical = false;
                }
            }
        }
        if(identical)
           return "files are identical";                                        //returns appropriate message
        else
           return "files are not identical";
        
        
    }
}
