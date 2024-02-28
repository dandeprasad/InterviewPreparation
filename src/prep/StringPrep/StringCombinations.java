package prep.StringPrep;

import java.util.ArrayList;
        import java.util.List;

public class StringCombinations {

    public static void main(String[] args) {
        String input = "abc";
        int r = 2; // Taken 2 at a time

        List<String> combinations = generateCombinations(input, r);

        // Print the combinations
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }

    private static List<String> generateCombinations(String input, int r) {
        List<String> result = new ArrayList<>();
        combine(input.toCharArray(), 0, r, new StringBuilder(), result);
        return result;
    }

    private static void combine(char[] array, int start, int r, StringBuilder current, List<String> result) {
        if (r == 0) {
            result.add(current.toString());
            return;
        }

        for (int i = start; i < array.length; i++) {
            current.append(array[i]);
            combine(array, i + 1, r - 1, current, result);
            current.setLength(current.length() - 1);
        }
    }
}
