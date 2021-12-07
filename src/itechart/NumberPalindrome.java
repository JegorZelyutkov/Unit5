package itechart;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {

        String stringNumber = Integer.toString(number);

        int i = 0;
        int k = stringNumber.length() - 1;

        while (i < k) {
            char firstChar = stringNumber.charAt(i);
            char secondChar = stringNumber.charAt(k);

            if (firstChar != secondChar) {
                return false;
            }

            i++;
            k--;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(707));
    }
}
