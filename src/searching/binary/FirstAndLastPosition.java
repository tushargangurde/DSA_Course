package searching.binary;

import java.util.Arrays;

public class FirstAndLastPosition {

    public static void main(String[] args) {
        int[] input = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;
        int[] result = search(input, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] search(int[] input, int target) {

        int[] ans = {-1, -1};

        int start = 0;
        int end = input.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == input[mid]) {
                ans[0] = mid;
                end = mid - 1;
            } else if (target < mid)
                end = mid - 1;
            else
                start = mid + 1;
        }

        start = 0;
        end = input.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == input[mid]) {
                ans[1] = mid;
                start = mid + 1;
            } else if (target < mid)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return ans;
    }

}
