package Java_tutorial.Overwritting;

public class pen extends animals{
    public pen(String name){
        super(name);
    }

    @Override
    public void eat(){
        System.out.println("kekee");
    }

    @Override
    public void drink(){
        System.out.println("bla bla");
    }
}
