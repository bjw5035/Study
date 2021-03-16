package Part6;

public class CoffeeR1 {
    String coffee;
    int money;

    public CoffeeR1(String coffee, int money) {
        this.coffee = coffee;
        this.money = money;
    }

    public void take(int money) {
        this.money += money;
    }

}
