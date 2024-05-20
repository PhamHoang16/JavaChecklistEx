package ArrayList;

import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("a");
        myList.add("b");
        myList.add("c");
        myList.add("d");

        System.out.println("Original list: " + myList);
        myList.remove(2);

        System.out.println("List after remove " + myList);
    }

}
