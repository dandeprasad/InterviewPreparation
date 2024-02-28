package prep.StringPrep;

import java.io.*;
        import java.math.*;
        import java.security.*;
        import java.text.*;
        import java.util.*;
        import java.util.concurrent.*;
        import java.util.function.*;
        import java.util.regex.*;
        import java.util.stream.*;
        import static java.util.stream.Collectors.joining;
        import static java.util.stream.Collectors.toList;

class String1Charremoval {

    /*
     * Complete the 'isValid' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isValid(String s) {

        int len = s.length();
        char[] givenString =  s.toCharArray();
        int [] countData = new int[26];

        int i=0;
        while(i<len){

            countData[givenString[i]-'a']++;
            i++;
        }
        HashSet<Integer> dd = new HashSet<>();
        for (int j=0;j<26 ; j++) {
            if(countData[j]!=0) {
                dd.add(countData[j]);
            }
        }
        if(dd.size()==1){
            return "YES";
        }
        else{

            for (Integer value : dd) {

                int [] temp = countData.clone();
                for(int k=0;k<countData.length;k++){
                    if(temp[k]!=0&&temp[k]==value){
                        temp[k]=value-1;
                        break;
                    }

                }
                HashSet<Integer> dd1 = new HashSet<>();
                for (int j=0;j<26 ; j++) {
                    if(temp[j]!=0) {
                        dd1.add(temp[j]);
                    }
                }
                if(dd1.size()==1){
                    return "YES";
                }

            }
            return "NO";
        }

    }

    public static void main(String[] args) throws IOException {

       System.out.println( isValid("abcdefghhgfedecba"));
    }

}
