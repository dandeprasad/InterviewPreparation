package prep.StringPrep.reverse.practice;

public class ReverseString2PointersTest {
    public static  void main(String[] args) {

        String data = "geekforgeeks";
        reverseString(data.toCharArray());
    }

    private static void reverseString(char[] charArray) {


        int n=charArray.length;
        for(int i=0,j=n-1;i<j;i++,j--){

            char temp = charArray[i];
            //System.out.println(temp);
            charArray [i]=charArray[j];
           // System.out.println(  charArray [i]);
            charArray[j] = temp;
        }
        System.out.println(new String(charArray));
        //skeegrofskeeg

    }
}
