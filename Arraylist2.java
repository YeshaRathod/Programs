package collection_Examples;

import java.util.ArrayList;

public class Arraylist2 {
    public static int max(ArrayList<Integer> list) {
        if (list.isEmpty()) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int maxValue = max(list);
        System.out.println("Maximum value: " + maxValue);

        ArrayList<Integer> emptyList = new ArrayList<>();
        int emptyListMaxValue = max(emptyList);
        System.out.println("Maximum value of an empty list: " + emptyListMaxValue);
    }
}

