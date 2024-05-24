package Lambda;

public class SumList {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        ISumList iSumList = arr -> {
            int sumOdd = 0;
            int sumEven = 0;
            for (int i : arr) {
                if (i % 2 == 0) sumEven += i;
                else sumOdd += i;
            }
            System.out.println("Sum of Evens: " + sumEven);
            System.out.println("Sum of Odds: " + sumOdd);
        };
        iSumList.calculateSum(array);
    }
}

interface ISumList {
    public void calculateSum(int[] arr);
}
