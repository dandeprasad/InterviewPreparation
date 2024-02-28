package prep.StringPrep.substrings.practice;

public class SubstringsOfStringTest {
    public static void main(String[] args) {
        char str[] = {'a', 'b', 'c'};
        subString(str, str.length);

    }

static void subString(char[] str,int len){

        for(int l=1;l<=len;l++){

            for (int i=0;i<=len-l;i++){

                for(int k=i;k<=i-1+l;k++){
                    System.out.print(str[k]);
                }
                System.out.println();
            }
        }
}
}
