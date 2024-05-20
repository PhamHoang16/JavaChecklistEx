package HashSet;

import java.util.HashSet;

public class AddHashSet {
    public static void main(String[] args) {
        HashSet<String> colors = new HashSet<String>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        colors.add("Yellow");

        System.out.println("Colors: " + colors);
    }

}
