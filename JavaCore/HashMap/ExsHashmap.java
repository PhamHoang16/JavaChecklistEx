package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ExsHashmap {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<>();

        countries.put("France", "Paris");
        countries.put("Germany", "Berlin");
        countries.put("Italy", "Rome");

        HashMap<Integer, String> student = new HashMap<>();
        student.put(1, "hoang");
        student.put(2, "trang");
        student.put(3, "doanh");

        if (student.isEmpty()) {
            System.out.println("empty.");
        } else {
            System.out.println("not empty.");
        }
        String keycheck = "France";
        if (countries.containsKey(keycheck)) {
            System.out.println("ok");
        } else {
            System.out.println("no");
        }

        System.out.println(countries);
        System.out.println(countries.size());

        HashMap<String, String> copycountry = new HashMap<>();
        copycountry.putAll(countries);
        System.out.println(copycountry);


        Set<Map.Entry<String, String>> entrySet = countries.entrySet();
        for (Map.Entry<String, String> entry : entrySet) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }

}
