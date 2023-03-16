package searching.linear;

public class SearchInRange {

    public static void main(String[] args) {
        int[] input = {23, 58, 97, 69, 41, 3, 67, 15, 48, 75};
        int target = 41;
        int result = search(input, target, 1, 5);
        System.out.println(result);
    }

    private static int search(int[] input, int target, int start, int end) {
        if (input.length == 0)
            return -1;
        for (int i = start; i <= end; i++) {
            if (input[i] == target)
                return i;
        }
        return -1;
    }

}
