package collection_Examples;

import java.util.*;

public class VectorOddNumbers {
    public static void main(String[] args) {
        // Create a Vector of numbers
        Vector<Integer> numbers = new Vector<>();
        numbers.add(23);
        numbers.add(11);
        numbers.add(45);
        numbers.add(70);
        numbers.add(32);
        numbers.add(19);

        Enumeration<Integer> enumeration = numbers.elements();

        System.out.println("Odd numbers in the Vector:");
        while (enumeration.hasMoreElements()) {
            int num = enumeration.nextElement();
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }
    }
}

