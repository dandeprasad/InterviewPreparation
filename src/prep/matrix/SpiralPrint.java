package prep.matrix;

// Java program to print a given matrix in spiral form
import java.io.*;

class SpiralPrint {

    // Function print matrix in spiral form
    //R C , arr
    static void spiralPrint(int R, int C, int a[][])
    {
        int i, k = 0, l = 0;

		/* k - starting row index
		R - ending row index
		l - starting column index
		C - ending column index
		i - iterator
		*/

        while (k < R && l < C) {
            // Print the first row from the remaining rows
            for (i = l; i < C; ++i) {
                System.out.print(a[k][i] + " ");
            }
            k++;

            // Print the last column from the remaining
            // columns
            for (i = k; i < R; ++i) {
                System.out.print(a[i][C - 1] + " ");
            }
            C--;

            // Print the last row from the remaining rows */
            if (k < R) {
                for (i = C - 1; i >= l; --i) {
                    System.out.print(a[R - 1][i] + " ");
                }
                R--;
            }

            // Print the first column from the remaining
            // columns */
            if (l < C) {
                for (i = R - 1; i >= k; --i) {
                    System.out.print(a[i][l] + " ");
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

