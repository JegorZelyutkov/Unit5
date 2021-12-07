package itechart;

public class LargestPrime {
    public static int getLargestPrimeDivisor(int number) {
        if (number < 2) {
            return -1;
        }

        int primeDivisor = 2;
        for (int i=2; i<=number; i++) {
            if (number % i == 0 && isPrime(i)) {
                primeDivisor = i;
            }
        }

        return primeDivisor;
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrimeDivisor(21));
        System.out.println(getLargestPrimeDivisor(217));
        System.out.println(getLargestPrimeDivisor(0));
        System.out.println(getLargestPrimeDivisor(45));
        System.out.println(getLargestPrimeDivisor(-1));
    }
}
