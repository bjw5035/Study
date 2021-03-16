package Part5;

public class PersonTest {
    public static void main(String[] args) {
        Person personah = new Person();

        personah.name = "김유신";
        personah.weight = 85.4F;
        personah.height = 180.0F;

        Person personLee = new Person("이순신", 175, 75);
    }
}
