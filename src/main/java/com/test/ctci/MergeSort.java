package com.test.ctci;

import java.util.Arrays;

public class MergeSort {
    public static void sort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = (low + high)/2;
            sort(arr, low, middle);
            sort(arr, middle + 1, high);
            merge(arr, low, middle, high);
        }
    }

    private static void merge(int[] arr, int low, int middle, int high) {
            int lIndex = low;
            int rIndex = middle + 1;
            int[] newArray = new int[high - low + 1];
            int newIter = 0;

            while (lIndex < middle + 1 || rIndex < high + 1) {
                if (lIndex >= middle + 1) {
                    newArray[newIter] = arr[rIndex];
                    rIndex++;
                } else if (rIndex >= high + 1) {
                    newArray[newIter] = arr[lIndex];
                    lIndex++;
                } else {
                    if (arr[lIndex] <= arr[rIndex]) {
                        newArray[newIter] = arr[lIndex];
                        lIndex++;
                    } else {
                        newArray[newIter] = arr[rIndex];
                        rIndex++;
                    }
                }
                newIter++;
            }
            System.arraycopy(newArray, 0, arr, low, newArray.length);
    }
}
