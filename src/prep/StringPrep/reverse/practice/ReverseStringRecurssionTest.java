package prep.StringPrep.reverse.practice;

public class ReverseStringRecurssionTest {

    public static void main(String args[]){
        char[] str = "geeksforgeeks".toCharArray();
        recursiveReverse(str,0);

        System.out.println(new String(str));
    }

    private static void recursiveReverse(char [] data,int index){

        int n = data.length;
        if(n/2==index){
            return;
        }
        swap(data,  index,n-index-1);

        recursiveReverse(data,index+1);
    }
   static void swap(char[] data,int i,int j){

        char temp = data[i];
        data[i]=data[j];
        data[j]=temp;
    }


}
