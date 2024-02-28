package prep.StringPrep.subSequence;

// Java program for the above approach
import java.util.*;
class SubSequencePickupNotPickup {

    // Declare a global list
    static List<String> al = new ArrayList<>();

    // Creating a public static Arraylist such that
    // we can store values
    // IF there is any question of returning the
    // we can directly return too// public static
    // ArrayList<String> al = new ArrayList<String>();
    public static void main(String[] args)
    {
        String s = "abcd";
        findsubsequences(s, ""); // Calling a function
        System.out.println(al);
    }

    private static void findsubsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }

        // We add adding 1st character in string
        //this will create the combinations by moving the data to ans
       findsubsequences(s.substring(1), ans + s.charAt(0));
        //findsubsequences(s.substring(0,s.length()-1), ans + s.charAt(s.length()-1));

        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not

        //this will remove 1 char at a time to give other combinations
        //findsubsequences(s.substring(0,s.length()-1), ans);
        findsubsequences(s.substring(1), ans);
    }
}
