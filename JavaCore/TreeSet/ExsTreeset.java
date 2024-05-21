package TreeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ExsTreeset {
    public static void main(String[] args) {
        String[] students = {"hoang", "trang", "minh", "khanh", "hoang"};
        Set<String> studentSet = new TreeSet<>();
        Set<String> studentSet2 = new HashSet<>();
        for (String student : students) {
            System.out.print(student+",");
            studentSet.add(student);
            studentSet2.add(student);
        }
        System.out.println(studentSet);
        System.out.println(studentSet2);

        TreeSet<String> colors = new TreeSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Orange");
        colors.add("Yellow");

        TreeSet<String> colors2 = new TreeSet<>();
        colors2.add("pink");
        colors2.add("white");

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(7);

        TreeSet<Integer> clonedNumbers = new TreeSet<>(numbers);

        clonedNumbers.add(10);
        System.out.println(clonedNumbers);

        if (!numbers.isEmpty()) {
            int firstElement = numbers.first();
            int lastElement = numbers.last();

            System.out.println("First element: " + firstElement);
            System.out.println("Last element: " + lastElement);
        } else {
            System.out.println("The TreeSet is empty.");
        }


        colors.addAll(colors2);

        System.out.println(colors);

        Iterator<String> iterator = colors.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            System.out.println(color);
        }
    }

}
