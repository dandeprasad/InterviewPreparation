package prep.hashmap;

import java.util.HashSet;


public class AnagramsHashMap {

    public static int sherlockAndAnagrams(String s) {

        HashSet<String> data = new HashSet<>();
        int n=s.length();
        for (int i = 0; i < n; i++){
            for (int j = i+1; j <= n; j++){

                data.add(s.substring(i, j));
            }
        }
        HashSet<String> dataR = new HashSet<>();
        for (String dd : data) {

            dataR.add(reverseString(dd.toCharArray()));
        }

        // Finding common elements
        HashSet<String> commonElements = new HashSet<>(data);
        commonElements.retainAll(dataR);
        return commonElements.size();

    }

    public static String reverseString(char[] charArray){
        int charl =  charArray.length;
        int i=0;
        int j = charl-1;
        while(i<j){

            char temp = charArray[i];
            charArray[i]=charArray[j];
            charArray[j] = temp;
            i++;j--;
        }

        return new String(charArray);

    }


    public static void main(String [] args){
        sherlockAndAnagrams("abbb");
    }
}
