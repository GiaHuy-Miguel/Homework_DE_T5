package Leetcode.Sort;

import java.util.Arrays;

class QuickSort {
    // Divide arrays into 2 parts around the pivot
    public int partition(int[] arr, int low, int high) {
        int i = low - 1;
        int pivot = arr[high];
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap arr[i] and arr[j]
                int temp1 = arr[j];
                arr[j] = arr[i];
                arr[i] = temp1;
            }
        }
        // swap arr[i+1] and arr[high]
        int temp2 = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp2;
        //Return pivot index
        return i + 1; //return pivot index
    }
    // Sort the right and left part of the array (around the pivot) recursively
    // Cùng phương thức như trên, phân nhỏ arrays đến khi sort xong
    public void sort(int[] arr, int low, int high){
        if (low < high){
            int pi_idx = partition(arr, low, high);
            sort(arr, low, pi_idx-1); // Sort left part of the array
            sort(arr, pi_idx+1, high); // Sort right part of the array
        }
    }
}
public class Quick_Sort {
    public static void main(String[] args) {
        int[] num = {12,4,56,3,990,21,33,25,78};
        QuickSort quicksort = new QuickSort();
        quicksort.sort(num, 0, num.length-1);
        System.out.println(Arrays.toString(num));
    }
}
