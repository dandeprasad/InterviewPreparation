package prep.StringPrep;
import java.util.ArrayList;
        import java.util.Collections;
        import java.util.List;

public class StringPermutationsTakenNatTime {

    public static void main(String[] args) {
        String input = "abc";
        int r = 2; // Taken 2 at a time

        List<String> permutations = generatePermutations(input, r);

        // Print the permutations
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    private static List<String> generatePermutations(String input, int r) {
        List<String> result = new ArrayList<>();
        permute(input.toCharArray(), 0, r, result);
        return result;
    }

    private static void permute(char[] array, int start, int r, List<String> result) {
        if (start == r) {
            result.add(new String(array, 0, r));
            return;
        }

        for (int i = start; i < array.length; i++) {
            // Swap characters
            char temp = array[start];
            array[start] = array[i];
            array[i] = temp;

            // Recursively generate permutations for the remaining characters
            permute(array, start + 1, r, result);

            // Undo the swap for backtracking
            temp = array[start];
            array[start] = array[i];
            array[i] = temp;
        }
    }
}
