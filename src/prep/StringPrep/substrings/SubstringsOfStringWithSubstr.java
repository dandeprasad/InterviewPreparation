package prep.StringPrep.substrings;

// Java program to print all substrings of a string
public class SubstringsOfStringWithSubstr {

    // Function to print all substring
    public static void SubString(String str, int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i+1; j <= n; j++)

                // Please refer below article for details
                // of substr in Java
                // https://www.geeksforgeeks.org/java-lang-string-substring-java/
                System.out.println(str.substring(i, j));
    }

    public static void main(String[] args)
    {
        String str = "abcd";
        SubString(str, str.length());
    }
}

// This code is contributed by ASHISH KUMAR PATEL
