package Java_tutorial.Overwritting;

public class run {
    public static void main(String[] args) {
        animals ass = new animals("HEHE");
        pen pn = new pen("KEKE");

        ass.eat();
        ass.drink();

        pn.drink();
        pn.eat();
    }
}
