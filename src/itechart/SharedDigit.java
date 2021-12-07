package itechart;

public class SharedDigit {
    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10 || firstNumber > 99) || (secondNumber < 10 || secondNumber > 99)) {
            return false;
        }

        while (firstNumber > 0) {
            int FirstNumberDigit = firstNumber % 10;

            while (secondNumber > 0) {
                int SecondNumberDigit = secondNumber % 10;

                if (FirstNumberDigit == SecondNumberDigit) {
                    return true;
                }

                secondNumber /= 10;
            }

            firstNumber /= 10;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(9, 99));
        System.out.println(hasSharedDigit(15, 55));
        System.out.println(hasSharedDigit(16, 24));
    }
}
