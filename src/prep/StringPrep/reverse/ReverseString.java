package prep.StringPrep.reverse;

// Java program to reverse a string using stack
import java.util.*;
class ReverseString
{
    public static String reversebyStack(char []str)
    {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<str.length; i++)
            // Push the charcters into stack
            st.push(str[i]);

        for (int i=0; i<str.length; i++) {
            // Pop the charcters of stack into the original string.
            str[i] = st.peek();
            st.pop();
        }
        return String.valueOf(str);// converting character array to string
    }

    // Driver program
    public static void main(String []args)
    {
        String str = "geeksforgeeks";
        str = reversebyStack(str.toCharArray());// passing character array as parameter
        System.out.println(str);
    }
}
// This code is contributed by Adarsh_Verma
