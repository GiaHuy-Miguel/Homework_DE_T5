package Java_tutorial.Static;
/*
static được coi là 1 thanhf viên của class đó
chứ không phải là 1 obj
==> đây là lý do chúng ta có thể sử dụng biến
static với tư cách là class name chứ không cần
khởi tạo obj

btvn
1. tại sao hi lại trả kết quả 2 lần mà he chỉ 1 lần
2. tại sao chữ he lại trả kết quả trước chữ hi trong khi code chữ he nhằm dưới chữ hi

 */



class Mobile1 {
    String brand ;
    int price;
    static String name;

    public void show1(){
        System.out.println(brand + price + name);
    }
    public static void show2(){
        System.out.println("static method");
    }


    public Mobile1(){
        brand ="";
        price = 777;
        System.out.println("hiiiiiiiiiiiiii");
    }

    static {
        name ="dat pro";
        System.out.println("heeeeeeeeeeeeeee");
    }
}
public class staticc {
    public static void main(String[] args) {

//        Mobile obj1 = new Mobile();
//        obj1.brand = "Apple";
//        obj1.price = 1500;
//        obj1.name = "Iphone 15";
//        //System.out.println(obj1.brand + obj1.price + obj1.name);
//
        Mobile obj2 = new Mobile();
        obj2.brand = "SamSung";
        obj2.price = 2000;
        obj2.name = "Appo s7";
        //System.out.println(obj2.brand + obj2.price + obj2.name);

        Mobile obj3 = new Mobile();
//        obj1.show1();
//        obj2.show1();
//
//        //static method
//        Mobile.show2();
//


        //static variable
//        Mobile.name = "dang dat";
//        System.out.println(Mobile.name);



    }
}
