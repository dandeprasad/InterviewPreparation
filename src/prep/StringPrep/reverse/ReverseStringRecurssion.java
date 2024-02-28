package prep.StringPrep.reverse;
import java.io.*;
class ReverseStringRecurssion
{

    // Recursive function to reverse the string
    static void recursiveReverse(char[] str, int i)
    {
        int n = str.length;

        if (i == n / 2)
            return;

// Swap the i and n-i-1 character
        swap(str,i,n - i - 1);

// Call Recursive function after incrementing i.
        recursiveReverse(str, i + 1);
    }
    static void swap(char []arr, int i, int j)
    {
        char temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    // Driver program
    public static void main(String[] args)
    {
        char[] str = "geeksforgeeks".toCharArray();
        recursiveReverse(str,0);
        System.out.println(String.valueOf(str));
    }
}

// This code is contributed by 29AjayKumar
