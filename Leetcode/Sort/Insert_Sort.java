package Leetcode.Sort;
import java.util.Arrays;

public class Insert_Sort {
    public static void main(String[] args) {
        //Sort tang dan
        int[] nums = {3,2,6,9,8,1,34,30};
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;
            while (j>= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }
            nums[j + 1] = key;
        }
        System.out.println(Arrays.toString(nums));
        // Sort giam dan
        int[] num1 = {3,2,6,9,8,1,34,30};
        for (int i = 1; i < num1.length; i++) {
            int key = num1[i];
            int j = i - 1;
            while (j>= 0 && num1[j] < key) {
                num1[j + 1] = num1[j];
                j = j - 1;
            }
            num1[j + 1] = key;
        }
        System.out.println(Arrays.toString(num1));
    }
}
