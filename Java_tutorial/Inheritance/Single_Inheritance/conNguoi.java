package Java_tutorial.Inheritance.Single_Inheritance;

public class conNguoi {
    private String HoVaTen;
    private int namSinh;

    public int getNameSinh() {
        return namSinh;
    }

    public void setNameSinh(int nameSinh) {
        this.namSinh = nameSinh;
    }

    public String getHoVaTen() {
        return HoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        HoVaTen = hoVaTen;
    }

    public conNguoi(int namSinh, String hoVaTen) {
        this.namSinh = namSinh;
        HoVaTen = hoVaTen;
    }

    public void an(){
        System.out.println("annnnnnnnnnnn");
    }

    public void ngu(){
        System.out.println("nguuuuuuuuuuuu");
    }
}
