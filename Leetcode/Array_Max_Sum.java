package Leetcode;

public class Array_Max_Sum {
    public static void main(String[] args) {
        //Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
        //Output = 6
//        List<Integer> lst = new ArrayList<Integer>();
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
//        for (int n = 0; n <= nums.length; n++){
//            int var =0;
//            for (int i = n; i <= nums.length - 1; i++){
//                var = var +nums[i];
//                lst.add(var);
//            }
//        }
//        System.out.println(Collections.max(lst));
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int a = 0;
        int b = 0;
        for (int i = 0; i < nums.length; i++){
            a += nums[i];
            if (a < 0) a = 0;
            if (b < a) b = a;
        }
        System.out.println("The largest sum is:" + b);
    }
}