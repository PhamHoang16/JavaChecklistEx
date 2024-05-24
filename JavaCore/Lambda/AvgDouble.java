package Lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AvgDouble {
    public static void main(String[] args) {
        ArrayList<Double> doubleArrayList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            doubleArrayList.add(Math.random() * 100);
        }
        System.out.println(doubleArrayList);
        IAvgDouble iAvgDouble = arrayList -> {
            double sum = 0;
            for (double i : arrayList) sum += i;
            return sum/arrayList.size();
        };
        System.out.println(iAvgDouble.CalculateAvg(doubleArrayList));
    }
}
interface IAvgDouble {
    public double CalculateAvg(ArrayList<Double> arrayList);
}
