package prep.StringPrep.substrings.practice;

public class SubstringUsingPreviousSubstringTest {
    public static void main(String[] args)
    {
        String s = "Geeky";

        printAllSubStrings(s, s.length());
    }


    static void printAllSubStrings(String s,int len){
        char[] main = s.toCharArray();
        int length = s.length();
        for(int i=0;i<length;i++){

            char[] data = new char[len];
            for(int j=i;j<length;j++){
                data[j]= main[j];
                System.out.println(data);
            }
        }
    }
}
