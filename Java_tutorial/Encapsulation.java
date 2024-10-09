package Java_tutorial;

class Human{
//    int passwork;
//    String username;
    private int passwork = 1234;
    private String username = "huy"; // Cannot access outside class

    /*
    Dùng setter và getter (chuột phải, chọn Generate, chọn setter/getter)
     */

    public int getPasswork(){
        return passwork;
    }

    public String getUsserName(){
        return username;
    }

    public void setPasswork(int setpasswork) {
        this.passwork = setpasswork;
    }

    public void setUsername(String setusername){
        this.username = setusername;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Human obj = new Human();
        int password = obj.getPasswork();
        String user_name = obj.getUsserName();
        System.out.println(user_name + ":" + password);

        obj.setPasswork(6868);
        obj.setUsername("hjhj");
        password = obj.getPasswork();
        user_name = obj.getUsserName();
        System.out.println(user_name + ":" + password);

    }
}
