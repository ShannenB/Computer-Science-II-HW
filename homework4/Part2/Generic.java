//Shannen Barrameda sib170130
package homework4.Part2;

import java.util.ArrayList;

public class Generic<E extends Comparable> {
    private ArrayList<E> list = new ArrayList<E>();  
  
    public void insertionSort(){
        E temp;
        for(int i = 1; i < list.size(); i++){
            temp = list.get(i);
            int j = i;
            while(j > 0 && (list.get(j-1).compareTo(temp) > 0)){
                list.set(j, list.get(j-1));
                j--;
            }
            list.set(j, temp);
        }
    }
    
    public int binarySearch( E key){
        int low = 0;
        int high = list.size() - 1;
        
        while(high >= low){
            int mid = (low + high)/2;
            if(list.get(mid).compareTo(key) > 0){
                high = mid - 1;
            }
            else if(list.get(mid).compareTo(key) == 0){
                return mid;
            }
            else{
                low = mid + 1;
            }  
        }   
        return -low -1;
        
    }
    
    public void add(E obj){
        list.add(obj);
    }
    
    @Override
    public String toString(){
        return list.toString();
    }
}
    

    
