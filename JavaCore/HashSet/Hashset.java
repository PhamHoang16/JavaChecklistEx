package HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<String>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        HashSet<String> colors = new HashSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");


        Iterator<String> iterator = fruits.iterator();
        System.out.println("Fruits:");
        while (iterator.hasNext()) {
            String fruit = iterator.next();
            System.out.println(fruit);
        }
        System.out.println("Number of elements in the HashSet: " + fruits.size());
        if (fruits.isEmpty()) {
            System.out.println("The HashSet is empty.");
        } else {
            System.out.println("The HashSet is not empty.");
        }


        HashSet<String> cloneFruit = new HashSet<String>();
        cloneFruit.addAll(fruits);
        System.out.println(cloneFruit);

        String[] array = fruits.toArray(new String[fruits.size()]);

        System.out.println(fruits.equals(colors));

        colors.clear();
        System.out.println(colors);
    }

}
