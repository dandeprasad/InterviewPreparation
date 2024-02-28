package prep.StringPrep.substrings.practice;

public class SubstringsOfStringWithSubstrTest {

    public static void main(String[] args)
    {
        String str = "abcd";
        SubString(str, str.length());
    }

    static void SubString(String str,int len){

        char[] stringChars = str.toCharArray();
        for (int i=0;i<len;i++){
            for(int j=i+1;j<=len;j++){

//both are same
               //System.out.println( str.substring(i,j));
                for(int k=i;k<j;k++){

                    System.out.print( stringChars[k]);
                }
                System.out.println();
            }
        }
    }
}
