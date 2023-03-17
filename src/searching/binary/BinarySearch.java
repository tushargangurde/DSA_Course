package searching.binary;

public class BinarySearch {

    public static void main(String[] args) {
        int[] input = {15, 29, 48, 56, 72, 83, 100};
        int target = 29;
        int result = search(input, target);
        System.out.println(result);
    }

    private static int search(int[] input, int target) {
        int start = 0;
        int end = input.length - 1;

        while (end >= start) {
            int mid = start + (end - start) / 2;
            if (target < input[mid])
                end = mid - 1;
            else if (target > input[mid])
                start = mid + 1;
            else
                return mid;
        }

        return -1;
    }

}
