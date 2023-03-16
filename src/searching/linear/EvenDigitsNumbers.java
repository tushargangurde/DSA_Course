package searching.linear;

public class EvenDigitsNumbers {
    public static void main(String[] args) {
        int[] input = {23, 58, 97, 698, 41, 3, 67, 145, 48, 75};
        int count = evenDigitsNumber(input);
        System.out.println("Even digit numbers: " + count);
    }

    private static int evenDigitsNumber(int[] input) {
        int count = 0;

        for (int number : input) {
            boolean isEvenDigit = countDigits(number);
            if (isEvenDigit)
                count++;
        }
        return count;
    }

    private static boolean countDigits(int number) {
        int temp = 0;

        do {
            number = number / 10;
            temp++;
        } while (number >= 1);

        return temp % 2 == 0;
    }
}
