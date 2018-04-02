//Shannen Barrameda sib170103
package homework4.Part2;


public class GenericMain{
    public static void main(String[] args){
        Generic<String> newListStrings = new Generic<String>();      
        Generic<Integer> newListInt = new Generic<Integer>();       
        Generic<Double> newListDoubles = new Generic<Double>();
        
        newListStrings.add("Hello");
        newListStrings.add("World");
        newListStrings.add("CS Class");
        
        System.out.println("Unsorted list of Strings: " + newListStrings.toString());
        newListStrings.insertionSort();
        System.out.println("Sorted list of Strings: " + newListStrings.toString());
        System.out.println("The word 'Hello' is at index " + newListStrings.binarySearch("Hello"));
        System.out.println();
        
        newListInt.add(1);
        newListInt.add(78);
        newListInt.add(43);
        newListInt.add(6);
        
        System.out.println("Unsorted list of integers: " + newListInt.toString());
        newListInt.insertionSort();
        System.out.println("Sorted list of integers: " + newListInt.toString());
        System.out.println("The number '78' is at index " + newListInt.binarySearch(78));
        System.out.println();
        
        newListDoubles.add(14.9);
        newListDoubles.add(-100.24);
        newListDoubles.add(28.8);
        newListDoubles.add(28.193);
        
        System.out.println("Unsorted list of doubles: " + newListDoubles.toString());
        newListDoubles.insertionSort();
        System.out.println("Sorted list of doubles: " + newListDoubles.toString());
        System.out.println("The number '-100.24' is at index: " + newListDoubles.binarySearch(-100.24));
        
        
    }
}
