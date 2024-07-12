package Java_tutorial;

// Object = Attribute + Function
// Tạo Object phải tạo Class trước tiên.
// Class là bản thiết kế cho Object. Từ 1 Class tạo ra nhiều Object
// How to create Object (Class) - Who create Object (JVM)

class Sum
{ int a = 1; //attribute

    public void results() { //function
        System.out.println("ket qua");
    }
    public int add(int n1, int n2) {
       int r = n1 + n2;
       return r;
    }

}

public class OOP {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Sum s = new Sum(); //Tạo Object

        System.out.println(s.a); //gọi attribute

        s.results(); //void func

        int sum = s.add(num1, num2); //return func
        System.out.println(sum);

    }
}
