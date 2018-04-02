//Shannen Barrameda sib170130
package homework4.Part1;

public class BinaryFormatException extends Exception {
    private String msg = "";
    public BinaryFormatException(String msg){
        super(msg);
        this.msg = msg;
    }    
    
    @Override
    public String getMessage(){
        return msg;
    }
    
    @Override
    public String toString(){
        return msg;
    }
}
