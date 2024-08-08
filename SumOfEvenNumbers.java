import java.util.ArrayList;

public class SumOfEvenNumbers {
    // Method to add all Even number of ArrayList
    public static int evenSum(ArrayList<Integer> arrayList){
        int sum = 0;
        // Using enhanced for-loop to iterate through the ArrayList
        for(int number:arrayList){
            if(number%2==0){
                sum+=number;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Creating an ArrayList to store integer objects
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(12);
        arrayList.add(19);
        arrayList.add(14);

        // Calling evenSum method and passing the ArrayList as an argument
        int sumOfEvenNumbers = evenSum(arrayList);
        System.out.println("Sum of all Even No :"+ sumOfEvenNumbers); // Output: Sum of all Even No :26
    }
}
