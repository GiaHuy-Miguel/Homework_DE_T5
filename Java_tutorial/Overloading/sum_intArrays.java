package Java_tutorial.Overloading;

public class sum_intArrays {
    public int cal(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }
}
