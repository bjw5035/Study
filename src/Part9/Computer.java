package Part9;

public abstract class Computer {
    public abstract void display();
    public abstract void typing();
    public void turnOn() {
        System.out.println("전원을 켠다.");
    }
    public void turnOff() {
        System.out.println("전원을 끈다.");
    }
}
