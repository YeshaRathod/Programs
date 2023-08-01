package prac;
import java.util.Scanner;
import java.util.Arrays;


public class Arrayoperation {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        // Ask the user size of arrray
        System.out.print("Enter the size of first array: ");
        int size1 = scanner.nextInt();
        int[] array1 = new int[size1];
        // enter elememts
        System.out.println("Enter the elements of the first array:");
        for (int i = 0; i < size1; i++) {
            array1[i] = scanner.nextInt();
        }
	
        System.out.print("Enter the size of second array: ");
        int size2 = scanner.nextInt();
        int[] array2 = new int[size1];
        // enter elememts
        System.out.println("Enter the elements of the second array:");
        for (int i = 0; i < size2; i++) {
            array2[i] = scanner.nextInt();
        }
	
     // Ask the user 
        System.out.println("Select the operation:");
        System.out.println("1. Sorting");
        System.out.println("2. Total of all elements");
        System.out.println("3. Merging two arrays");
        choice = scanner.nextInt();
        
        switch (choice) {
        case 1:
            //sort
            Arrays.sort(array1);
            Arrays.sort(array2);
            System.out.println("Sorted first array: " + Arrays.toString(array1));
            System.out.println("Sorted second array: " + Arrays.toString(array2));
            break;
        
        case 2:
            // Total of all elements
            int total1 = getSum(array1);
            int total2 = getSum(array2);
            System.out.println("Total of elements in the first array: " + total1);
            System.out.println("Total of elements in the second array: " + total2);
            break;
        case 3:
            // Merging two arrays
            int[] mergedArray = mergeArrays(array1, array2);
            System.out.println("Merged array: " + Arrays.toString(mergedArray));
            break;
            
        default:
            System.out.println("Invalid choice.");
            break;
           }
        }
            
            public static int getSum(int[] arr) {
                int sum = 0;
                for (int no : arr) {
                    sum += no;
                }
                return sum;}
            
            public static int[] mergeArrays(int[] arr1, int[] arr2) {
                int[] mergedArray = new int[arr1.length + arr2.length];
                int index = 0;
                for (int value : arr1) {
                    mergedArray[index] = value;
                    index++;
                }
                for (int value : arr2) {
                    mergedArray[index] = value;
                    index++;
                }
                return mergedArray;
            }
       
	}

