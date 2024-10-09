package Java_tutorial.Inheritance.Single_Inheritance;

public class run {
    public static void main(String[] args) {
        conNguoi cng = new conNguoi(123, "HUY");
        hocSinh hs = new hocSinh("HEY", 333, "Chuyen Hoa", "TPC");

//        cng.an();
//        cng.ngu();

        hs.an();
        hs.ngu();
        hs.choi();
        hs.hoc();

    }
}
