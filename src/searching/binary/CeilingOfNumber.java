package searching.binary;

public class CeilingOfNumber {

    // Ceiling = The Smallest element in the array which is greater or equal to target

    public static void main(String[] args) {
        int[] input = {15, 29, 48, 56, 72, 83, 100};
        int target = 49;
        int result = ceiling(input, target);
        System.out.println(result);
    }

    private static int ceiling(int[] input, int target) {

        int start = 0;
        int end = input.length - 1;

        if (target > input[end])
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

        return input[start];
    }


}
