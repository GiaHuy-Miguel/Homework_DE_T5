package Hw;
import java.util.Arrays;

public class hw_buoi2_2606 {
    public static void main(String[] args) {
        /*
//        Example 1:
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: The subarray [4,-1,2,1] has the largest sum 6.

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++){
            a += nums[i];
            if (a < 0) a = 0;
            if (b < a) b = a;
        }
        System.out.println("The largest sum is:" + b);
*/
        /*

//        Example 2:
//        Input: nums = [1]
//        Output: 1
//        Explanation: The subarray [1] has the largest sum 1.

        int[] nums = {1};
        if (nums.length == 1) System.out.println("The largest sum is:" + nums[0]);
*/

//        Example 3:
//        Input: nums = [5,4,-1,7,8]
//        Output: 23
//        Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

        int[] nums = {5,4,-1,7,8};
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++){
            a += nums[i];
            if (a < 0) a = 0;
            if (b < a) b = a;
        }
        System.out.println("The largest sum is:" + b);

/*
//        Example 4:
        int[] nums = {2, 0, 2, 1, 1, 0};
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

 */
    }
}