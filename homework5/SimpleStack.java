package homework5;
//Shannen Barrameda sib170130

/**
 *
 * @author Shannen Barrameda
 */
import java.util.LinkedList;
public class SimpleStack {
    private LinkedList<Character> charListStack = new LinkedList<Character>();
    
    public SimpleStack(){
        
    }
    public void add(char c){
        charListStack.add(c);
    }
    
    public Character remove(){
        return charListStack.removeLast();
    }
    
    public int getSize(){
        return charListStack.size();
    }
    
    @Override
    public String toString(){
        return "Stack: " + charListStack.toString();
    }
}
