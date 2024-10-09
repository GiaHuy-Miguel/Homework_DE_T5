package Java_tutorial.Overloading;

public class Test {

    public int tinhTong(int a, int b) {
        return a + b;
    }

    public float tinhTong(float a1, float b1) {
        return a1 + b1;
    }

    public int tinhTong(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += nums[i];
        }
        return result;
    }

    /*
        Viết method để tính tổng cho các dạng sau:
        1. tổng 2 số nguyên
        2. tổng 2 số thập phân
        3. tính tổng các phần tử trong mảng số nguyên
        4. tìm min của 2 số nguyên
        5. tìm min của 2 số thập phân
        Mỗi bài một hàm
     */
    public static void main(String[] args) {
        sum_int sumInt = new sum_int();
        sum_float sumFloat = new sum_float();

        System.out.println(sumInt.cal(4,5));
        System.out.println(sumFloat.cal(3.5f, 5.6f));

        min_2_int min2Int = new min_2_int();
        min_2_float min2Float = new min_2_float();

        System.out.println(min2Int.cal(4,5));
        System.out.println(min2Float.cal(3.5f, 5.6f));

        sum_intArrays sumIntArrays = new sum_intArrays();
        int[] nums = {1,2,3,4,5};
        int r = sumIntArrays.cal(nums);
        System.out.println(r);
    }
}
