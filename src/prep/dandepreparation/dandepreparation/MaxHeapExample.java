package dandepreparation;

import java.util.Arrays;

public class MaxHeapExample {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeapExample(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Get the parent index of a node
    private int parent(int i) {
        return (i - 1) / 2;
    }

    // Get the left child index of a node
    private int leftChild(int i) {
        return 2 * i + 1;
    }

    // Get the right child index of a node
    private int rightChild(int i) {
        return 2 * i + 2;
    }

    // Insert a new element into the max-heap
    public void insert(int value) {
        if (size == capacity) {
            System.out.println("Heap is full. Cannot insert " + value);
            return;
        }

        // Insert the new element at the end
        size++;
        int index = size - 1;
        heap[index] = value;

        // Heapify up: Maintain the max-heap property
        while (index > 0 && heap[parent(index)] < heap[index]) {
            // Swap the current element with its parent
            int temp = heap[index];
            heap[index] = heap[parent(index)];
            heap[parent(index)] = temp;

            // Move up the tree
            index = parent(index);
        }
    }

    // Extract the maximum element from the max-heap
    public int extractMax() {
        if (size <= 0) {
            System.out.println("Heap is empty. Cannot extract maximum.");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            size--;
            return heap[0];
        }

        // Store the maximum value (at the root)
        int max = heap[0];

        // Replace the root with the last element
        heap[0] = heap[size - 1];
        size--;

        // Heapify down: Maintain the max-heap property
        maxHeapify(0);

        return max;
    }

    // Helper method for heapifying down
    private void maxHeapify(int i) {
        int left = leftChild(i);
        int right = rightChild(i);
        int largest = i;

        // Find the index of the largest element among the node and its children
        if (left < size && heap[left] > heap[i]) {
            largest = left;
        }
        if (right < size && heap[right] > heap[largest]) {
            largest = right;
        }

        if (largest != i) {
            // Swap the current element with the largest child
            int temp = heap[i];
            heap[i] = heap[largest];
            heap[largest] = temp;

            // Recursively heapify the affected sub-tree
            maxHeapify(largest);
        }
    }

    public static void main(String[] args) {
        MaxHeapExample maxHeap = new MaxHeapExample(10);

        // Insert elements into the max-heap
        maxHeap.insert(10);
        maxHeap.insert(20);
        maxHeap.insert(15);
        maxHeap.insert(40);
        maxHeap.insert(50);

        System.out.println("Max-Heap: " + Arrays.toString(maxHeap.heap));
        // Max-Heap: [50, 40, 15, 10, 20]

        // Extract the maximum element
        int max = maxHeap.extractMax();
        System.out.println("Extracted maximum element: " + max);
        // Extracted maximum element: 50

        System.out.println("Max-Heap after extraction: " + Arrays.toString(maxHeap.heap));
        // Max-Heap after extraction: [40, 20, 15, 10]

        // Insert another element
        maxHeap.insert(60);

        System.out.println("Max-Heap after insertion: " + Arrays.toString(maxHeap.heap));
        // Max-Heap after insertion: [60, 40, 15, 10, 20]
    }
}