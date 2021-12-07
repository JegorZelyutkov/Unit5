package itechart;

public class FlourPackProblem {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        int sum = 0;
        int i = 0;

        do {
            if (bigCount != 0) {
                sum += 5;
            }

            if (sum == goal) {
                return true;
            }

            for (int j = 0; j < smallCount; j++) {
                sum += 1;

                if (sum == goal) {
                    return true;
                }
            }

            sum -= smallCount;
            i++;
        } while (i < bigCount);

        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
}
