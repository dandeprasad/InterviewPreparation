package prep.StringPrep.reverse;

//A Simple Iterative Java program to reverse
//a string
import java.io.*;
class ReverseString2Pointers {

    //Function to reverse a string
    static void reverseStr(String str)
    {
        int n = str.length();
        char []ch = str.toCharArray();
        char temp;

        // Swap character starting from two
        // corners
        // i is the left pointer and j is the right pointer

        //both works here
/*        for (int i=0, j=n-1; i<j; i++,j--)
        {
            temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
        }*/

        for (int i=0; i<n-1-i; i++)
        {
            temp = ch[i];
            ch[i] = ch[n-1-i];
            ch[n-1-i] = temp;
        }


        System.out.println(ch);
    }

    //Driver program
    public static void main(String[] args) {

        String str = "geeksforgeeks";
        reverseStr(str);
    }
}
// This code is contributed by Ita_c.
