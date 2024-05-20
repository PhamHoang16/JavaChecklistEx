package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("a");
        names.add("b");
        names.add("c");
        names.add("d");

        System.out.println("Original list: " + names);

        Collections.sort(names);

        System.out.println("Sorted list (ascending order): " + names);

    }

}
