package searching.binary;

public class CeilingOfCharacter {

    public static void main(String[] args) {
        char[] input = {'c', 'f', 'j'};
        char target = 'z';
        String result = ceiling(input, target);
        System.out.println(result);
    }

    private static String ceiling(char[] input, char target) {

        int start = 0;
        int end = input.length - 1;

        if (target >= input[end])
            return String.valueOf(input[start]);

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < input[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }

        return String.valueOf(input[start]);
    }

}
