package Lambda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortString {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        str.add("hoang");
        str.add("trang");
        str.add("pham");
        str.add("doanh");

        ISortString iSortString = stringArrayList ->
            Collections.sort(stringArrayList);
        iSortString.sortStr(str);
        for (String s : str) System.out.println(s);
    }
}
interface ISortString {
    public void sortStr(ArrayList<String> stringArrayList);
}
