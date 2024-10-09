package Auto_Apprentissage;

class de_quy {
    /*
    Đệ quy là hàm mà trong đó nó tự gọi chính nó:
        - De quy có 2 phan: TH cơ so va phan de quy
     */

    void f() {
        f();
    }

    // SUM OF NUMBERS FROM 1 TO M
    public int f(int m) {
        if (m == 1) return 1; //TH co so
        return f(m - 1) + m; //Recursion_dequy
    }

    // FIND Nth FIBONACCI NUMBER
    public int fibonacci(int n) {
        if (n == 1) return 0; //THCS 1
        if (n == 2) return 1; //THCS 2
        return f(n - 1) + f(n - 2); //RECURSION
    }



public class recursion_backtracking {
    public static void main(String[] args) {
        de_quy hihi = new de_quy();
        int tong_giai_thua = hihi.f(5);
        System.out.println(tong_giai_thua);
        System.out.println(1 + 2 + 3 + 4 + 5);
        System.out.println("So fibonacci thu 5: " + hihi.fibonacci(5));
        }
    }
}
