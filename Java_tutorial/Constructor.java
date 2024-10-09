package Java_tutorial;

/*
    Constructor khởi tạo cùng lúc với obj
    Constructor là một function trùng teen với Class
 */

class Human_{
    private int passwork;
    private String username;

    public Human_(String name, int password){
        System.out.println("huhu");
        username= name;
        passwork = password;
    }

    public Human_(){
        System.out.println("in constructor");
    }

//    GETTERs
    public int getPasswork() {
        return passwork;
    }
    public String getUsername() {
        return username;
    }

}

public class Constructor {
    public static void main(String[] args) {
        Human_ obj = new Human_("huy", 123);
        System.out.println("human: "+ obj.getUsername() +", password: " + obj.getPasswork());

        Human_ obj1 = new Human_("vutrg", 2328);
        System.out.println("human: "+ obj1.getUsername() +", password: " + obj1.getPasswork());

        Human_ obj2 = new Human_();
    }
}
