package searching.linear;

public class LinearSearch {
    public static void main(String[] args) {
        int[] input = {23, 58, 97, 69, 41, 3, 67, 15, 48, 75};
        int target = 41;
        int result = search(input, target);
        System.out.println(result);
    }

    //search in the array
    private static int search(int[] input, int target) {
        if (input.length == 0)
            return -1;
        for (int i = 0; i < input.length; i++) {
            if (input[i] == target)
                return i;
        }
        return -1;
    }
}