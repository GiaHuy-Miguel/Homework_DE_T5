package Hw;
import java.util.Scanner;

//Bai 1
/*
public class hw {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your salary (million VND): ");
        int salary = reader.nextInt();
        if (salary <= 7) {
            System.out.println("Your tax rate is 10%");
        } else if (salary < 15) {
            System.out.println("Your tax rate is 20%");
        } else {
            System.out.println("Your tax rate is 30%");
        }
    }

} */

//Bai 2
/*
public class hw {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your children's age: ");
        int age = reader.nextInt();
        if (age == 16) {
            System.out.println("Your kids can go to high school.");
        }
        else {
            System.out.println("Your kids can not go to high school");
        }

    }
} */

//Bai 3
/*
public class hw {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num = reader.nextInt();
        if (num < 100) {
            System.out.println("your number is smaller than 100");
        }
        else if (num == 100) {
            System.out.println("your number is 100");
        }
        else {
            System.out.println("your number is larger than 100");
        }

    }
} */

//Bai 4
/*
public class hw {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = 3;
        int[] ar = new int[arr_size];
            System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr_size; i++) {
            if (sc.hasNextInt()) {
                ar[i] = sc.nextInt();
            }
        }
        Arrays.sort(ar);
        System.out.println("The largest number is: " + Integer.toString(ar[arr_size - 1]));
    }
} */

//Bai 5
public class hw_buoi1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = 3;
        int[] ar = new int[arr_size];
        System.out.println("Enter the regular test score: ");
        ar[0] = sc.nextInt();
        System.out.println("Enter the middle exam score: ");
        ar[1] = sc.nextInt();
        System.out.println("Enter the final exam score: ");
        ar[2] = sc.nextInt();
        float avg_score = (float) (ar[0] + ar[1] + ar[2])/ 3;
        if (avg_score >= 9.0) {
            System.out.println("The total is: " + Float.toString(avg_score));
            System.out.println("You are ranked A");
        }
        else if (avg_score >= 7) {
            System.out.println("The total is: " + Float.toString(avg_score));
            System.out.println("You are ranked B");
        }
        else if (avg_score >= 5) {
            System.out.println("The total is: " + Float.toString(avg_score));
            System.out.println("You are ranked C");
        }
        else {
            System.out.println("The total is: " + Float.toString(avg_score));
            System.out.println("You are ranked F");
        }
    }
}