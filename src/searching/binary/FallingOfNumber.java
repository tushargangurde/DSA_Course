package searching.binary;

public class FallingOfNumber {

    // Falling = The Greatest element in the array which is smaller or equal to target
    public static void main(String[] args) {
        int[] input = {15, 29, 48, 56, 72, 83, 100};
        int target = 49;
        int result = falling(input, target);
        System.out.println(result);
    }

    private static int falling(int[] input, int target) {

        int start = 0;
        int end = input.length - 1;

        if (target < input[start])
            return -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < input[mid])
                end = mid - 1;
            else if (target > input[mid])
                start = mid + 1;
            else
                return input[mid];
        }

        return input[end];
    }

}
