package Java_tutorial;

import java.util.Arrays;

/*
GOAL:
     - MẢNG HAI CHIỀU
     - FOR-EACH LOOP
     - LOOP QUA ARRAY CHỨA OBJECTF (ỨNG DỤNG STACK & HEAP)
 */

class Student {
    int STT;
    String ten;
    int diemso;

}

public class arrays {

    public static void main(String[] args) {
//        int[] nums = {3,5,6,7};
//        // update index in array
//        nums[2] = 10;
//        System.out.println(nums[2]);
//        System.out.println(Arrays.toString(nums));

        // Mảng một chiều
        int[] nums1 = new int[5];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;
        nums1[3] = 4;
        nums1[4] = 5;
        System.out.println(Arrays.toString(nums1));

        // Mảng hai chiều - Đưa vào check chang capture (CDC) và validate data
        int[][] nums2 = new int[3][4];
        //3 mảng; 4 index
        for (int i =0; i < nums2.length; i++) {
            for (int j =0; j < 4; j++){
                nums2[i][j] = (int)(Math.random() * 100);
                System.out.print(nums2[i][j] + " ");
            }
            System.out.println(); // Thêm dấu cách
        }

        // For - each loop - Chỉ dùng cho ARRAYS:
        System.out.println();
        System.out.println("For - each loop: ");
        for (int[] i: nums2){ //hoặc int i[] cũng được
            for (int a: i) {
                System.out.print(a + " ");
            }
            System.out.println();
        }

        // LOOP QUA ARRAY CHỨA OBJECT
        Student s1 = new Student();
        s1.diemso = 10;
        s1.ten = "dat";
        s1.STT = 1;

        Student s2 = new Student();
        s2.diemso = 9;
        s2.ten = "tien";
        s2.STT = 2;

        Student s3 = new Student();
        s3.diemso = 8;
        s3.ten = "dang";
        s3.STT = 3;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

//        for (int i =0; i < students.length; i++ ){
//            System.out.println(students[i].STT + " " + students[i].ten + " " + students[i].diemso);

        for (Student stud: students){
            System.out.println(
                    stud.STT + " "
                    + stud.ten + " "
                    + stud.diemso);
        }
    }
}
