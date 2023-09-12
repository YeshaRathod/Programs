package collection_Examples;

import java.util.ArrayList;

public class ArrayListFirstElement {
    public static String firstElement(ArrayList<String> list) {
        if (list.isEmpty()) {
            return "";
        }

        return list.get(0);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("world");

        String first = firstElement(list);
        System.out.println("First element: " + first);

        ArrayList<String> emptyList = new ArrayList<>();
        String emptyFirst = firstElement(emptyList);
        System.out.println("First element of an empty list: '" + emptyFirst + "'");
    }
}

