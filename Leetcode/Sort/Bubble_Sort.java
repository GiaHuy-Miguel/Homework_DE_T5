package Leetcode.Sort;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] num ={8,6,9,2,4,5};
        // Sort tang dan
        for (int j =0; j < num.length;j++) {
            for (int i = 0; i < num.length - 1; i++) {
                int temp = num[i];
                if (num[i] > num[i+1]) {
                    num[i] = num[i+1];
                    num[i+1] = temp;
                }
            }
        }
        System.out.println("Sort tang dan " + Arrays.toString(num));
        // Sort giam dan
        int[] num1 ={8,6,9,2,4,5};
        for (int j =0; j < num.length;j++) {
            for (int i = 0; i < num.length - 1; i++) {
                int temp = num1[i];
                if (num1[i] < num1[i+1]) {
                    num1[i] = num1[i+1];
                    num1[i+1] = temp;
                }
            }
        }
        System.out.println("Sort giam dan " + Arrays.toString(num1));
    }
}
