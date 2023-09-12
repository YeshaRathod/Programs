package collection_Examples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDescendingOrder {
    public static void main(String[] args) {
        // Create an ArrayList of 10 numbers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(23);
        numbers.add(11);
        numbers.add(45);
        numbers.add(7);
        numbers.add(32);
        numbers.add(19);
        numbers.add(56);
        numbers.add(4);
        numbers.add(81);
        numbers.add(10);

        // Sort the ArrayList in descending order
        Collections.sort(numbers);
        Collections.reverse(numbers);

        // Print the sorted ArrayList
        System.out.println("ArrayList in descending order:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}

