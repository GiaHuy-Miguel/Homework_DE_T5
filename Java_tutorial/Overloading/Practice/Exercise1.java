package Java_tutorial.Overloading.Practice;

public class Exercise1 {
    public int dienTich(){
        return 1;
    }

    public double dienTich(double a, double b){
        return a*b;
    }

    public double dienTich(double a){
        return 3.14*a*a;
    }

    public static void main(String[] args) {
        Exercise1 ex = new Exercise1();

        System.out.println(ex.dienTich());
        System.out.println(ex.dienTich(3,4.5));
        System.out.println(ex.dienTich(5.67));
    }
}
