package Part6;

class BirthDay {
    int day;
    int month;
    int year;

public void setYear(int year) {
    this.year = year;
}

public void printThis() {
    System.out.println(this);
  }
}

public class ThisExample {
    public static void main(String[] args) {
        BirthDay bDay = new BirthDay();
        bDay.year = 2000;
        System.out.println(bDay);
//        bDay.day = 5;
//        bDay.month = 4;
        bDay.printThis();
    }
}
