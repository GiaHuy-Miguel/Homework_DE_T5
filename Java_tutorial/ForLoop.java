package Java_tutorial;

public class ForLoop {
    public static void main(String[] args) {
//        // syntax: for (condition)
//        for (int x = 1; x <= 10; x++){
//            System.out.println("hi BIGDATA" + x);
//        }
        // For loop with arrays
        int[] nums = {1,2,3,4,5,6,7,9};
        // for( int i = 0; i<= nums.length; i ++)
        // Java ko chơi index âm
        for (int i =  nums.length -1; i >=0; i--){ //i-- => chạy ngược lại
            System.out.println(nums[i]); //Nhớ trừ 1 vì index đi từ 0 còn i chạy từ 1
        }
    }
}
