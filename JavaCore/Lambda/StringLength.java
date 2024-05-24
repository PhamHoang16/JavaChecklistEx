package Lambda;

import java.util.ArrayList;

public class StringLength {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("haha");
        arrayList.add("h");
        arrayList.add("hha");
        arrayList.add("hassha");
        arrayList.add("hahaaaaaa");

        IStringLength iStringLength = strList -> {
            double sum = 0;
            for (String s : strList) {
                sum += s.length();
            }
            return sum/strList.size();
        };
        System.out.println(iStringLength.avgLength(arrayList));
    }
}
interface IStringLength {
    public double avgLength(ArrayList<String> strList);
}
