package Lambda;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(10);
        arr.add(0);
        arr.add(1);
        arr.add(3);
        arr.add(40);
        arr.add(60);
        System.out.println(arr);

        IRemoveDuplicate iRemoveDuplicate = arrayList -> {
            LinkedHashSet<Integer> integersSet = new LinkedHashSet<>(arrayList);
        };
    }
}
interface IRemoveDuplicate {
    public void removeDup (ArrayList<Integer> arrayList);
}
