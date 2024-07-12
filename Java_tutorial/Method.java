package Java_tutorial;

class Computer {
    public void playMusic() {
        System.out.println("music playing");
    }
    public String buyPen (int cost) { //Gọi hàm return gì thì lệnh return phải chơi cái đó
        if (cost <= 10)     return "ILL BUY";
        else return "NOO";
        // return 0 =>> lỗi
    }
}

class Calculator {
    //METHOD OVERLOADING
    public int add(int n1, int n2){
        return n1 + n2;
    }

    public int add(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public Float add(Float n1, Float n2, Float n3){
        return n1 + n2 + n3;
    }

}
public class Method {
    public static void main(String[] args) {
//        int num1 = 3;
//        int num2 = 5;
//        int num3 =6;
// Gọi void function
        Computer com = new Computer();
        Calculator calc = new Calculator();
        com.playMusic();
// Gọi return function
        int giabut = 20;
        String abc = com.buyPen(giabut);
        System.out.println(abc);
// Gọi method overloading
        int result1 = calc.add(2, 3);
        System.out.println("Function1: " + result1);
        int result2 = calc.add(2, 3, 4);
        System.out.println("Function2: " + result2);
        Float result3 = calc.add(3.5F, 4.5F, 5.5F);
        System.out.println("Function3: " + result3);
    }
}
