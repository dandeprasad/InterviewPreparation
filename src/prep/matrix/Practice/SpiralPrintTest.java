package prep.matrix.Practice;

// Java program to print a given matrix in spiral form

class SpiralPrintTest {

    // Function print matrix in spiral form
    //R C , arr
    static void spiralPrint(int R, int C, int a[][])
    {


        int rowSize=R;
        int colSize=C;


        int l = 0;

        int k = 0;

        while (k < R && l < C) {



            for(int i=l;i<C;i++){

                System.out.print(a[k][i] +" ");
            }
            k++;


            for(int j=k;j<R;j++) {
                System.out.print( a[j][C-1] +" ");
            }
            C--;


if(k<R) {
    for (int i = C - 1; i >= l; i--) {

        System.out.print(a[R - 1][i] +" ");
    }
    R--;
}


if (l<C) {
    for (int j = R-1; j >= k; j--) {
        System.out.print(a[j][l]  +" ");
    }
    l++;
}
        }

    }

    // Driver Code
    public static void main(String[] args)
    {
        int R = 4;
        int C = 4;
        int a[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        // Function Call
        spiralPrint(R, C, a);
    }
}


// Contributed by Pramod Kumar

