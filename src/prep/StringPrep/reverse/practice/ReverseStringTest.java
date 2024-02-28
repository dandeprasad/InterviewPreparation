package prep.StringPrep.reverse.practice;

import java.util.Stack;

public class ReverseStringTest {

    public static void main(String []args) {
        String str = "geeksforgeeks";

        reverseStringFun(str.toCharArray());
    }
    private static void reverseStringFun(char[] str){
System.out.println(str[0]);
        Stack<Character> strData = new Stack<>();

        for (char c : str) {

            strData.push(c);
            System.out.println(strData.capacity());
        }
        for(int j=0;j<str.length;j++){
            str[j]= strData.peek();
            strData.pop();
        }

        String finalOutput = new String(str);
System.out.println(finalOutput);
}}



