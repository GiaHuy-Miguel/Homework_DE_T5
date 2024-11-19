package Leetcode.Sort;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        // Sort tang dan
        int[] num = {3,6,7,1,2,19,88,46,5,4,8,9};
        for(int i =0; i < num.length; i++) {
            int minPosition = i;
            for (int j = i+1; j < num.length; j++) {
                if (num[minPosition] > num[j]) {
                    minPosition = j;
                }
            }
            if (minPosition != i) {
                int temp = num[i];
                num[i] = num[minPosition];
                num[minPosition] = temp;
            }
        }
        System.out.println("Min Position Sort: " + Arrays.toString(num));
        // Sort giam dan
        int[] num1 = {3,6,7,1,2,19,88,46,5,4,8,9};
        for(int i = 0; i < num1.length; i++) {
            int maxPosition = i;
            for (int j = i+1; j  < num1.length ; j++) {
                if (num1[maxPosition] < num1[j]) {
                    maxPosition = j;
                }
            }
            if (maxPosition != i) {
                int temp = num1[i];
                num1[i] = num1[maxPosition];
                num1[maxPosition] = temp;
            }
        }
        System.out.println("Max Position Sort: " + Arrays.toString(num1));
    }
}
