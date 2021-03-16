package Problem;

public class Person {
    public String name;
    public int money;

    public Person(String name) {
        this.name = name;
    }

    public void take(int money) {
        this.money -= money;
    }
}
