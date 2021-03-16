//package Part6;
//
//class Person {
//    String name;
//    int age;
//
//    Person() {
//        this("이름없음", 1);
//    }
//
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    Person returnItSelf() {   // this 반환 (반환형은 클래스형으로)
//        return this;
//    }
//}
//public class CallAnotherCont {
//    public static void main(String[] args) {
//        Person noName = new Person();
//        System.out.println(noName.name);
//        System.out.println(noName.age);
//
//        Person p = noName.returnItSelf();
//        System.out.println(p);
//        System.out.println(noName);
//    }
//}
