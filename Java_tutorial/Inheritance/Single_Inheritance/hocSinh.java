package Java_tutorial.Inheritance.Single_Inheritance;

public class hocSinh extends conNguoi {
    private String tenLop;
    private String tenTruong;

    public String getTenTruong() {
        return tenTruong;
    }

    public void setTenTruong(String tenTruong) {
        this.tenTruong = tenTruong;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public hocSinh(String hoVaTen, int namSinh,
                   String tenLop,
                   String tenTruong){
        super(namSinh, hoVaTen);
        this.tenLop = tenLop;
        this.tenTruong = tenTruong;
    }

    public void hoc(){
        System.out.println("zzzzzzzzz");
    }

    public void choi(){
        System.out.println("chiu chiu chiu");
    }
}
