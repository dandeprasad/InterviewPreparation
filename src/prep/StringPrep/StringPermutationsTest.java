package prep.StringPrep;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsTest {

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

    static void generatePermutationsHelper(String prefix, String remaining, List<String> permutations){
       int n =  remaining.length();

       if(n==0){
           permutations.add(prefix);
       }
        for(int i=0;i<n;i++){
            String newPrefix=prefix+ remaining.charAt(i);

            String newRemaining = remaining.substring(0, i)+remaining.substring(i+1);

            generatePermutationsHelper(newPrefix,newRemaining,permutations);
        }
    }

}