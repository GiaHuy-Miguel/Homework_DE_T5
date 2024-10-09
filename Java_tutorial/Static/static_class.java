package Java_tutorial.Static;

/*
    BIẾN STATIC ĐƯỢC COI LÀ 1 THÀNH VIÊN CỦA 1 CLASS - NGANG VỚI CLASS
    =>> KHÔNG CẦN KHỞI TẠO OBJ
 */

class Mobile {
    String brand;
    int price;
    static String name; // BIẾN TĨNH ĐƯỢC XEM LÀ THÀNH VIÊN CỦA 1 CLASS

    public void show(){
        System.out.println(brand);
    }

    public static void show1() {
        System.out.println(name); // Biến thường không được phép add vào static func
    }

    public Mobile() {
        System.out.println("ahihihihi");
    }
}

public class static_class {
            public static void main(String[] args) {
                Mobile mobile1 = new Mobile();
                mobile1.brand = "apple";
                mobile1.show();

                Mobile mobile2 = new Mobile(); // Tên hàm == tên class nên đã gọi hàm Mobile() luôn
                mobile2.show();



                Mobile.name = "dang dat";
                Mobile.show1();
    }
}
