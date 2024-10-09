package Java_tutorial.Overwritting;

public class animals {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public animals(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("annnnnnn");
    }

    public void sleep(){
        System.out.println("nguuuuuuuu");
    }

    public void drink(){
        System.out.println("uonggggggg");
    }
}
