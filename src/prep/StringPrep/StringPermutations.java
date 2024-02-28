package prep.StringPrep;

import java.util.ArrayList;
import java.util.List;

public class StringPermutations {

    public static void main(String[] args) {
        String input = "abc";
        List<String> permutations = generatePermutations(input);

        System.out.println("Permutations of " + input + ":");
        for (String permutation : permutations) {
            System.out.println(permutation);
        }
    }

    // Main function to initiate permutation generation
    public static List<String> generatePermutations(String input) {
        List<String> permutations = new ArrayList<>();
        generatePermutationsHelper("", input, permutations);
        return permutations;
    }

    // Recursive helper function to generate permutations
    private static void generatePermutationsHelper(String prefix, String remaining, List<String> permutations) {
        // Base case: if the remaining string is empty, add the current permutation to the list
        int n = remaining.length();
        if (n == 0) {
            permutations.add(prefix);
        } else {
            // Recursive case: iterate over each character in the remaining string
            for (int i = 0; i < n; i++) {
                // Form a new prefix by appending the current character
                String newPrefix = prefix + remaining.charAt(i);

                // Form a new remaining string by excluding the current character
                String newRemaining = remaining.substring(0, i) + remaining.substring(i + 1);

                // Recursively call the helper function with the new prefix and remaining string
                generatePermutationsHelper(newPrefix, newRemaining, permutations);
            }
        }
    }
}

