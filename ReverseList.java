import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ReverseList {
    public static void main(String[] args) {
        // Create an ArrayList to store the list of strings
        ArrayList<String> list = new ArrayList<>();

        // Add String to the ArrayList
        list.add("Amit");
        list.add("Himanshu");
        list.add("Deepak");
        list.add("Vijay");

        // Print the list using enhanced for-loop;
        for(String value: list){
            System.out.print(value+" "); // Output: Amit Himanshu Deepak Vijay
        }

        // Reverse the order of elements in the list
        Collections.reverse(list);

        System.out.println();
        // Print the list after reversed the order of list
        for(String value: list){
            System.out.print(value+" "); // Output: Vijay Deepak Himanshu Amit
        }
    }
}
