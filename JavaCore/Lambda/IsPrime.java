package Lambda;

public class IsPrime {
    public static void main(String[] args) {
        IIsPrime iIsPrime = number -> {
            for (int i = 2; i < number/2; i++) {
                if (number % i == 0) return false;
            }
            return true;
        };
        System.out.println(iIsPrime.checkPrime(7));
    }
}
interface IIsPrime {
    public boolean checkPrime(int number);
}
