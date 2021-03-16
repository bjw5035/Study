package Part6;

public class Person {
    public String name;
    public int money;

    public Person(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeA1(CoffeeA1 coffeeA1) {
        this.money -= 4000;
        coffeeA1.take(4000); //가격 지정해줌
    }
    public void takeR1(CoffeeR1 coffeeR1) {
        this.money -= 4500;
        coffeeR1.take(4500);
    }

    public void showInfo() {
        System.out.println(name + money + "를 냈습니다.");
    }
}
