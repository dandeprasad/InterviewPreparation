package prep.array;

import java.util.*;

public class MinimumSwapsToSort {

    public static void main(String[] args) {
        int[] arr = {7,1,3,2,4,5,6};
        System.out.println(minimumSwaps(arr)); // Output: 3
    }

    public static int minimumSwaps(int[] arr) {
        int n = arr.length;
        int swaps = 0;

        // Create an array of pairs to store the original position of each element
        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(arr[i], i);
        }
//        List<Pair> dd = new ArrayList();
//        Collections.sort(dd,Comparator.comparingInt(Pair::getValue));
        // Sort the pairs based on the values
        Arrays.sort(pairs, Comparator.comparingInt(Pair::getValue));

        // Create an array to keep track of visited elements
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] || pairs[i].getIndex() == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;
                j = pairs[j].getIndex();
                cycleSize++;
            }

            if (cycleSize > 0) {
                // A cycle of size k requires k-1 swaps to arrange elements in the correct order
                swaps += (cycleSize - 1);
            }
        }

        return swaps;
    }

    static class Pair {
        private final int value;
        private final int index;

        public Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }

        public int getValue() {
            return value;
        }

        public int getIndex() {
            return index;
        }
    }
}
