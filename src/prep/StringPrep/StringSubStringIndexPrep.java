package prep.StringPrep;

public class StringSubStringIndexPrep {

    public static void main(String args[]){
        String s1="javatpoint";
        System.out.println(s1.substring(0,s1.length()-1));//returns va

        // this gives substring from 0 - length (Internally it will do length-1 index position)
        System.out.println(s1.substring(s1.length()-1));

//this just gives index
        System.out.println(s1.indexOf(0,s1.length()-1));
        System.out.println(s1.indexOf(s1.length()-1));
       // System.out.println(s1.substring(2));//returns vatpoint
    }
}
