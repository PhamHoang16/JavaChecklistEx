package Lambda;

public class FactorialNumber {
    public static void main(String[] args) {
        IFactorialNumber iFactorialNumber = number -> {
            long fact = 1;
            for (int i = 1; i <= number; i++) {
                fact *= i;
            }
            return fact;
        };
        System.out.println(iFactorialNumber.calculateFact(10));
    }
}
interface IFactorialNumber {
    public long calculateFact(int number);
}
