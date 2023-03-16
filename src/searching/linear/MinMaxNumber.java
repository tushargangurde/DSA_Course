package searching.linear;

public class MinMaxNumber {

    public static void main(String[] args) {
        int[] input = {23, 58, 97, 69, 41, 3, 67, 15, 48, 75};
        int min = minNumber(input);
        int max = maxNumber(input);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }

    private static int maxNumber(int[] input) {
        if (input.length == 0)
            return -1;
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max)
                max = input[i];
        }
        return max;
    }

    private static int minNumber(int[] input) {
        if (input.length == 0)
            return -1;
        int min = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] < min)
                min = input[i];
        }
        return min;
    }

}
