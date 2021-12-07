package itechart;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int divisor = 1;
        int minimumNumber = Math.min(first, second);

        int i=1;
        while (i <= minimumNumber) {
            if (first % i == 0 && second % i == 0) {
                divisor = i;
            }

            i++;
        }

        return divisor;
    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
        System.out.println(getGreatestCommonDivisor(12, 30));
        System.out.println(getGreatestCommonDivisor(9, 18));
        System.out.println(getGreatestCommonDivisor(81, 153));
    }
}
