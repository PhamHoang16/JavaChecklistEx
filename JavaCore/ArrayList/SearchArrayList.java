package ArrayList;

import java.util.ArrayList;

public class SearchArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int elementToSearch = 30;

        if (numbers.contains(elementToSearch)) {
            System.out.println("Element " + elementToSearch + " found in the list");
        } else {
            System.out.println("Element " + elementToSearch + " not found in the list");
        }

        int index = numbers.indexOf(elementToSearch);
        if (index != -1) {
            System.out.println("Element " + elementToSearch + " found at index " + index);
        } else {
            System.out.println("Element " + elementToSearch);
        }
    }

}
