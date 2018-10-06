package com.test.ctci;

public class QuickSort {

    static public void sort(int[] arr, int low, int high) {
        if (low < high) {
            int p = partition(arr, low, high);

            sort(arr, low, p - 1);
            sort(arr, p + 1, high);
        }
    }

    static private int partition(int[] arr, int low, int high) {
        int pivotIndex = low;
        int swapIndex = pivotIndex + 1;

        for (int i = pivotIndex + 1; i <= high; i++) {
            if (arr[i] <= arr[pivotIndex]) {
                swap(arr, swapIndex, i);
                swapIndex++;
            }
        }

        swapIndex--;

        swap(arr, pivotIndex, swapIndex);
        return swapIndex;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
