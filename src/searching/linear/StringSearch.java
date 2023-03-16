package searching.linear;

public class StringSearch {

    public static void main(String[] args) {
        String input = "Tushar";
        char target = 'h';
        int result = search(input, target);
        System.out.println(result);
    }

    //search in the array
    private static int search(String input, char target) {
        if (input.length() == 0)
            return -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target)
                return i;
        }
        return -1;
    }

}
