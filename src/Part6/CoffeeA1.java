package Part6;

public class CoffeeA1 {
    String coffee;
    int money;

    public CoffeeA1(String coffee, int money) {
        this.coffee = coffee;
        this.money = money;
    }
    public void take(int money) {
        this.money += money;
    }
}
