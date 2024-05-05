package dandepreparation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsAndCombinations {
    public static List<List<Integer>> generatePermutations(List<Integer> elements) {
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutationsHelper(elements, new ArrayList<>(), permutations);
        return permutations;
    }

    private static void generatePermutationsHelper(List<Integer> elements, List<Integer> currentPermutation, List<List<Integer>> permutations) {
        if (elements.isEmpty()) {
            permutations.add(new ArrayList<>(currentPermutation));
            return;
        }

        for (int i = 0; i < elements.size(); i++) {
            int element = elements.get(i);
            currentPermutation.add(element);
            List<Integer> remaining = new ArrayList<>(elements);
            remaining.remove(i);
            generatePermutationsHelper(remaining, currentPermutation, permutations);
            currentPermutation.remove(currentPermutation.size() - 1);
        }
    }

    public static List<List<Integer>> generateCombinations(List<Integer> elements, int k) {
        List<List<Integer>> combinations = new ArrayList<>();
        generateCombinationsHelper(elements, k, 0, new ArrayList<>(), combinations);
        return combinations;
    }

    private static void generateCombinationsHelper(List<Integer> elements, int k, int start, List<Integer> currentCombination, List<List<Integer>> combinations) {
        if (k == 0) {
            combinations.add(new ArrayList<>(currentCombination));
            return;
        }

        for (int i = start; i < elements.size(); i++) {
            currentCombination.add(elements.get(i));
            generateCombinationsHelper(elements, k - 1, i + 1, currentCombination, combinations);
            currentCombination.remove(currentCombination.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> elements = Arrays.asList(1, 2, 3);
        int k = 2;

        List<List<Integer>> permutations = generatePermutations(new ArrayList<>(elements));
        System.out.println("Permutations: " + permutations);

        List<List<Integer>> combinations = generateCombinations(new ArrayList<>(elements), k);
        System.out.println("Combinations (k=" + k + "): " + combinations);
    }
}
