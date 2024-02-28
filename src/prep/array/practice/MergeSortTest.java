package prep.array.practice;



public class MergeSortTest {


    static void sort(int[] arr,int l,int n){

        if(l < n) {
            int m = l + (n - l) / 2;

            sort(arr, l, m);
            sort(arr, m + 1, n);

            merge(arr, l, m, n);
        }
    }

    private static void merge(int[] arr, int l, int m, int n) {

        int n1= m-l+1;
        int n2=n-m;

       int[] temp1 = new int[n1];
        int[] temp2 = new int[n2];

        for(int i=0;i<n1;i++){
            temp1[i]=arr[l+i];
        }
        for(int i=0;i<n2;i++){
            temp2[i]=arr[m+1+i];
        }
        int i=0;int j=0;
        int k=l;
        while(i<n1 && j<n2){

            if(temp1[i]<=temp2[j]){
                arr[k]=temp1[i];
                i=i+1;
            }
            else{

                arr[k]=temp2[j];
                j++;
            }
            k++;
        }

       while(i<n1){
           arr[k]=temp1[i];
           i++;
           k++;
       }
        while(j<n2){
            arr[k]=temp2[j];
            j++;
            k++;
        }


    }

    static void printArray(int[] data){
        for(int i = 0;i<data.length;i++){
            System.out.print(data[i] +" ");

        }
    }
    public static void main(String args[])
    {

        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given array is");
        printArray(arr);

        MergeSortTest ob = new MergeSortTest();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array is");
        printArray(arr);
    }
}


