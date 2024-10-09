package Java_tutorial;

public class string {
    public static void main(String[] args) {
        String name = new String("dat"); //Ban chat String la 1 class
        //Cal obj = new Cal();
        name = name + " tien";

        // System.out.println(name.charAt(1));
        System.out.println(name.concat(" dang"));

        String s1 = "zutrg"; //unmutable string =>> khong thay doi duoc
        String s2 = new String ("manhthoi");
        // =>> STRING BUFFER (BO DEM CHUOI) =>> mutable =>> thay doi duoc
        /*
            cho 1 chuoi va minh co the thay doi chuoi
            cung cap cho minh kich thuoc bo nho dem 16mb
         */

        StringBuffer n = new StringBuffer("DAT");
        System.out.println(n.capacity());
        System.out.println(n.length());
        //System.out.println(n.append(" TIEN"));
        n.append(" dep trai");
        n.insert(0, "bo may ");
        System.out.println(n);

        String s3 = "HUY";
        String s4 = "HUY"; // =>> HUY sẽ được gắn nhãn 102 =>> s3 - 102, s4 - 102.
        // =>> HEAP GẮN NHÃN THEO VALUE/ THEO OBJECT TẠO ĐƯỢC

        String s5 = new String("HUY"); // Lưu thêm 1 biến nữa trong bộ nhớ HEAP



    }
}
