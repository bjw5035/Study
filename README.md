# JavaStudy

■ 2021-03-06 (0일차)
 - 매주 토요일 1시 ~ 5시 (총 4시간 진행)
 - 스터디 전까지 최소 1개 챕터 이상 공부하기
 - 발표 및 토론 (2시간 30분) / 코딩 문제 풀기 (1시간 30분)
 - 이해가 잘 되지 않는 부분은 필히 체크하기!


■ 2021-03-13 (1일차)
 - 클래스에 대한 이해
    - 클래스를 사용하는 이유
        - 관리의 효율성을 위해서다.
        - 예를 들면, 사람이란 클래스를 만들 때 편리하다.
          그 이유는 클래스 안에 사람에 대한 데이터(이름, 나이, 주소 등)를 지정하고, 
          행위에 대한 메소드를 만들면, 하나의 클래스를 편하게 다룰 수 있기 때문이다.

          ■ 주의할 점, 클래스와 객체의 의미는 다르다.
            - 클래스는 설계도 라고 이해하면 되고, 객체는 설계도로 구현한 모든 대상을 의미한다.
              Ex) 클래스를 만들어 놓고 쓰지 않으면, 설계도의 존재 이유가 없다.
                  우리가 클래스(설계도)를 이용하여, 무엇을 만든다면, 그것이 바로 객체란 개념이다.
                  그 객체가 바로 클래스의 인스턴스다.
``` 
                  public class A { int a }
                  순서 : 클래스 생성 -> 객체 생성 -> 사용
```       
    - Top level 클래스는 public으로 선언하고 반드시 java 파일명과 같아야 한다.
```
      public class Test {} == Test.java
```
    - Main 메소드는 하나의 프로젝트에서 여러 개 존재할 수 없으며, 무조건 하나다.
      그리고 프로그램은 Main에서 시작하고, Main에서 끝난다.
      즉, Main 안에서 여러 메소드를 호출하고, 호출한 메소드는 또 다른 메소드를 호출할 수도 있다.
      결국에는 돌고 돌아, 다시 Main으로 돌아오게 되어 있다.

 - 스태틱(static) 과 인스턴스(instance) 의 차이
    - 인스턴스 메소드와 변수는 반드시 new 선언을 해야 사용 가능하다.
      이유 : 멤버 변수 즉, 클래스 내부에서 선언한 변수들은 new 선언을 하지 않으면,
             Heap 메모리 영역에 할당이 되지 않기 때문에 사용할 수가 없다.
             따라서, 사용하기 위해서는 힙 메모리 영역에 할당을 해야 한다.
```
             public class Test {
                 int t;
             }
                public static void Main(String[] args) {
                    Test t; <- new 선언을 하지 않았기 때문에, Heap 메모리 영역에 할당 X
                    따라서, t.t <- 는 사용 불가능이다.

                    t = new Test() <- new 선언으로 Heap 메모리 영역에 할당 O
                    따라서, t.t <- 는 사용 가능하다.
                }
```
      단점 : 과도한 사용은 메모리를 많이 잡아 먹으며, 치명적인 오류로 이어질 수 있다.
             Ex) 어떤 한 프로그램을 실행중인데 메모리 점유율이 타 실행중인 프로그램에 비해
                 훨씬 높으면, 다른 프로그램을 사용할 수 없게 되는 상황에 이르기도 한다.

    - static은 어떤 인스턴스든 접근하여 사용 가능하지만, 남발하면 시스템 성능 저하를 일으킨다.
      이유 : static은 클래스가 로딩되는 순간 메소드 영역(Method Area)에 처음으로 
             생성되어 메모리를 할당한다. 
             그 메모리는 파일이 종료되기 전까지 남아있기 때문에, 중간에 제거를 할 수가 없다. 따라서, 무분별한 사용은 하지 않는 게 좋다.
             TIP) 절대 바뀌지 않는 변수를 설정해야 할 때, static 변수가 제격이다.
```
                 public final static int MAX = 100;
```
                 여기서 final은 변하지 않는 값 즉, 상수를 의미한다.
                 참고로, 상수는 모두 대문자로 선언해야 한다.

      장점 : 손쉽게 사용 가능하다. (클래스명.static메소드 or 변수)
             객체를 생성하는 게 아니기 때문에 더 빠르다.
      단점 : 고정 메모리가 할당되기 때문에 많이 사용하면, 메모리 관리 측면에서 효율성이 떨어진다.
             이 단점을 극복하기 위해서는 사용 후, 반드시 null로 초기화하는 것이다.

 - 생성자와 this에 대한 이해
    - 생성자는 초기화를 위해 사용한다.
    - new() 에서 () 부분이 생성자를 의미하며, 생성자를 사용하지 않고 코드를 구현한다면,
      더 많은 코드를 짜야 하기 때문에, 효율적인 측면에서 생성자를 사용한다.
      사용법)
```
public class Person {
    String name;
    int age;

    public static void Main(String[] args) {
        생성자가 없다면?
        Person p = new Person();
        p.name = "제임스";
        p.age = 20;
        
        생성자가 있다면?
        Person p = new Person("제임스", 20);
        
        ! 이게 바로 생성자를 사용하는 이유이다.
    }
}
```
    - this는 내장변수라고 부르며, 인스턴스의 자기 자신을 의미한다.
    - this를 사용하는 이유는, 인스턴스 변수임을 명확히 하기 위함이다.
```
      public class Cafe {
            String name;
            String menu;
            int price;
            
            public Cafe(String name, String menu) {
                this.name = name; 
                this.menu = menu;

                여기서 this.name은 Cafe 클래스 내부에 선언된 String name을 의미하며,
                name은 생성자에서 받아 온 파라미터(매개변수)를 의미한다.
                따라서, this.name과 name은 절대 같은 값이 아니다.
            }
      }
```
 - 접근제어자의 이해
    - private, default, protected, public 네 가지 종류로 이루어져 있다.
        - private 은 현재 클래스 내부에서만 사용 가능하다.
          Ex) private class A {}
          여기서 짚고 넘어가야 할 점은,
          A 라는 클래스 파일을 생성한다고 가정해보자.
          그럼 만드는 순간, public class A {} 라는 코드가 삽입이 된다.
          여기서 public을 빼서 default로 사용할 수도 있다.
          다만, public, default를 제외한 나머지(private, protected)는
          붙일 수가 없다.
          추가로, default로 선언하면, 파일명과 같지 않아도 오류가 나지 않지만,
          타 클래스에서 상속을 받아서 사용할 수가 없게 된다.

        - default 는 리턴타입 앞에 아무 것도 선언하지 않음을 의미하고,
          같은 패키지 안에 있는 다른 클래스에 접근이 가능하다.
          Ex) class A {} - class 앞에 아무 것도 붙이지 않는다.
          같은 패키지의 다른 클래스에서 접근이 가능하다는 것이지, 
          상속을 받을 수 있다는 뜻은 아니다.

        - protected 는 같은 패키지와 상속 받은 클래스에서만 접근 가능하다.
          상속 받은 클래스란, 접근제어자 클래스명 extends 클래스명.
          Ex) public Team extends Group
          여기서 Team 클래스가 Group의 클래스를 상속 받았단 뜻이다.
          그래서 부모 클래스는 Group 이고, 자식 클래스는 Team 이다.
          따라서, 상속관계에만 있다면, 어느 패키지든 접근이 가능하다.

        - public 은 한 프로젝트 폴더 안에 있는 모든 패키지에 접근 가능하다.

 - Setter 와 Getter의 이해
    - 정보은닉을 위해서 사용한다 (정보은닉에 대해서는 추후 진행할 예정)
    - 인스턴스 변수는 반드시 private으로 선언하며, setter와 getter는 public으로 사용한다.

 - ArrayList 의 사용법 이해
    - 배열 선언
```
      int[] i = new int[5]; 또는 int[] i = new int[] {1,2,3,4};
```
      주의할 점 : 
```
      int[] i = new int[5] {1,2,3,4,5}; 
```
      위 코드는 오류다.



■ 2021-03-20 (2일차)
 - 생성자와 this에 대한 복습
    - 생성자는 인스턴스를 생성할 때, 초기값을 주는 용도로 사용된다.
      ```
      public class Foods {
        int numberOfFood;
        String name;
        String producer;
        String origin;

        public Foods(int numberOfFood, String name, String producer, String origin) {
          this.numberOfFood = numberOfFood;
          this.name = name;
          this.producer = producer;
          this.origin = origin;
        }

        public static void main(String[] args) {
          Foods food = new Foods(10, "사과", "김이윤", "청송");
          대괄호가 생성자를 의미한다.
          선언과 동시에 값 초기화가 가능하다.
          이러한 장점이 있기에 생성자를 사용한다.
        }
      }
      ```
  
  - 상속
    - 상속은 말 그대로 어떤 객체를 타 객체에 귀속시키는 걸 의미한다.
    - 아래 코드로 예를 들어보자.
    ```
    public class Winner {
      int score;
      String name;

      class Loser extends Winner {
        
      }
    }
    ```
    위 코드에서 Loser가 Winner의 상속을 받았단 뜻이 된다.
    Loser -> Winner 가 된다.
    헷갈리지 말자!
    Loser <- Winner 가 아니다.
    원래대로라면, Winner가 Loser를 가리키는 게 맞지만,
    자바에서는 반대가 맞다.
    
    상속을 쓰는 이유는 효율성이다.
    예를 들면, 고객의 데이터를 다룬다면,
    고객의 등급이 나뉘어 질 것이다.
    Silver를 default로 VVIP까지 있다고 가정해보자.
    
    Customer 클래스를 만들어서 VVIP까지 다 다룰 수 있다.
    하지만, 한 클래스에 방대한 양의 코드가 만들어지게 된다.
    반대로, 각 등급마다 클래스를 만든다면, 한 클래스 안의 코드 양이
    훨씬 적어진다.
    
    비록 클래스가 더 많아진다는 점이 있지만, 크게 보았을 때 단점은 아니다.
    
    각 등급마다 주어지는 할인율 혹은 혜택이 다 다르기 때문에
    Customer 클래스를 부모 클래스로 지정하고,
    나머지 GoldCustomer, DiamondCustomer, VIPCustomer를 자식 클래스로 지정한다.
    
    Customer 클래스를 상속 받음으로써, 기본 인스턴스(아이디, 성명, 전화번호 등)을
    만들지 않아도 된다.
    혜택에 관련된 데이터만 만들면 된다.

    ```
    class Customer {
      int customerID;
      String customerName;
      String phoneNumber;
      float saleRatio;

      public Customer(int customerID, String customerName, String phoneNumber) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        
        this.saleRatio = 0.01;
      }

      class VIPCustomer extends Customer{
        int bonusPoint;
        
        public VIPCustomer(ind customerID, String customerName, String phoneNumber) {
          super(customerID, customerName, phoneNumber);
          super.saleRatio = 0.05;
        }

        public void bonus(int price) {
          bonusPoint += price * 0.01;
        }
      }
    }
    ```
    이렇게 상위 클래스인 Customer는 기본적인 인스턴스만 정의하고,
    하위 클래스인 VIPCustomer는 추가적으로 넣을 인스턴스만 정의하고,
    나머지는 상위 클래스인 Customer의 데이터를 사용한다.
  
  - 다형성
    - 다형성은 여러 타입의 객체를 참조할 수 있다.
      예를 들면, A, B, C, D 클래스들이 있다고 가정해보자.
      
      A클래스는 부모 클래스이며, B와 C 클래스는 A클래스를 상속 받는다.
      그리고 마지막 D클래스는 C 클래스를 상속 받는다.
      
      그래서 D클래스로 인스턴스 선언을 하면, A와 C 클래스의 인스턴스 및 메소드를
      사용할 수 있다.
      ```
      class A {
        int a;
      }
      class B extends A {
        int b;
      }
      class C extends A {
        int c;
      }
      class D extends C {
        int d;
      }
      public static void main(String[] args) {
        D d = new D();
        d.a; <- 가능
        d.c; <- 가능
        
        하지만, 부모클래스로 선언을 하면 이야기가 달라진다.
        A ace = new D();
        위 ace 인스턴스는 A의 a밖에 사용하지 못 한다.
        이와 같이 사용하는 이유는 제약을 걸기 위함이다.
        D클래스의 인스턴스를 사용 방지 목적으로 사용한다.

        D ace = new A();
        위 인스턴스는 오류다.
        부모 클래스를 인스턴스화 시켜서 자식 클래스에 넘겨줄 수 없다.
        
        이것이 다형성이다.
      }
      ```

  - super와 this의 차이
    - super는 현재 클래스를 건너 뛰고, 상위 클래스부터 찾아 올라간다.
    - this는 현재 클래스부터 찾아서 상위 클래스까지 찾아 올라간다.
    - 원하는 데이터를 발견 시, 그 클래스에서 더이상 올라가지 않는다.
    ```
    class A {
        int b;
      }
      class B extends A {
        int b;
      }
      class C extends A {
        int b;
      }
      class D extends C {
        int b;
        
        public void m() {
          super.b = 1;
        }
      }
      ```
      D 클래스의 m메소드 안의 b라는 인스턴스를 super로 탐색한다.
      자기 클래스를 상속한 C클래스부터 찾는다.
      만약 b가 있다면, C클래스의 인스턴스 b에 1을 넣고 끝이 난다.
      
      반대로, super.b가 아닌 this.b로 한다면,
      현재 클래스부터 시작하기 때문에 D클래스의 b를 참조하고 끝난다.
      그래서 D클래스의 b는 1이 된다.

  - 오버라이딩
    - 오버라이딩은 쉽게 말하자면, 부모 클래스의 메소드를
      자식 클래스가 원하는대로 바꿔서 사용하는 것이다.
      전제조건이 있는데, 접근제어자 리턴타입 메소드명이 전부 다 같아야 한다.
      하나라도 틀리면, 그건 오버라이딩이 아니다.
      ```
      public class First {
        public void head() {
          System.out.println("퍼스트");
        }
      }
      class Second extends First {
        @Override
        public void head() {
          System.out.println("세컨드");
        }
      }
      ```
      위 코드에서 한 가지 주의깊게 볼 점은
      바로 @Override 이다.
      @은 애노테이션이라 하고, 주석이라 부른다.
      주석을 새겨서, JVM에 이 메소드는 오버라이딩된 메소드라고 알려준다.
      그래서 Second클래스로 인스턴스를 선언하고, head 메소드를 출력하면,
      퍼스트 가 아닌, 세컨드로 출력된다.

      만일, Second클래스의 head() 메소드가 hand() 메소드로 명명한다면,
      오버라이딩이 아니고, 새 메소드를 생성한 셈이 된다.
      


| 매개변수 | 설명                                                 |
| -------- | :--------------------------------------------------- |
| src      | 복사할 배열 이름                                     |
| srcPos   | 복사할 배열의 첫 번째 위치                           |
| dest     | 복사해서 붙여 넣을 대상 배열 이름수                  |
| destPos  | 복사해서 대상 배열에 붙여 넣기를 시작할 첫 번째 위치 |
| lengh    | src에서 dest로 자료를 복사할 요소 개수               |


 - ArrayList 클래스의 주요 메서드
 
| 메서드              | 설명                                                         |
| ------------------- | :----------------------------------------------------------- |
| boolean add(E e)    | 요소 하나를 배열에 추가한다. E는 요소의 자료형을 의미한다.   |
| int size()          | 배열에 추가된 요소 전체 개수를 반환한다.                     |
| E get(int index)    | 배열의 index 위치에 있는 요소 값을 반환한다.                 |
| E remove(int index) | 배열의 index 위치에 있는 요소 값을 제거하고 그 값을 반환한다. |
| boolean isEmpty()   | 배열이 비어 있는지 확인한다.                                 |



■ 2021-03-27 (3일차)

- 추상클래스

  - 상속 관계

    - 일반 클래스끼리 상속을 하며 사용할 수도 있지만, 일반 클래스가 추상클래스를 상속 받아서 사용할 수도 있다.
    - 추상클래스는 추상메소드를 선언할 수 있다. 추상메소드는 참고로, 메소드 몸체가 없다. 그래서 메소드 시그니처만 선언하고, 상속 받은 클래스에서 오버라이딩해서 사용해야 한다. 오버라이딩을 하지 않으면, 오류가 발생하기에 실행할 수 없게 된다.

    ```
    public abstract class AbstractClass {
      int x, y;
      static int z;
    
      abstract void m(); <- 메소드명까지를 메소드 시그니처라 한다.
      void m2() {}; <- 중괄호 안에 있는 코드를 메소드 몸체라 한다.
    }
    
    public class SubClass extends AbstractClass {
      int a, b;
    
      @Override
      void m() {
        System.out.println("Abs의 추상메소드 사용");
      }
    }
    ```

    위 코드에서 볼 수 있듯이, 추상클래스 AbstractClass m2() 메소드는 일반 메소드이기에, 상속 받은 SubClass 클래스에서 사용은 선택이다. 즉, 강제성이 유효한 메소드를 추상메소드 라고 보면 된다.

  - 선언할 수 있는 범위

    - 추상클래스를 상속 받은 일반 클래스는 추상클래스의 인스턴스를 생성할 수 없다. 하지만, 다형성을 이용하여 일반 클래스의 인스턴스 생성은 가능하다.

      ```
      AbstractClass abs = new AbstractClass(); <- 불가능
      추상클래스에는 생성자라는 것이 존재하지 않기 때문이다.
      
      AbstractClass abs = new SubClass(); <- 가능
      다형성을 이용하여 선언이 가능하다.
      추상클래스를 상속 받을지라도, 일반클래스는 생성자가
      존재하기 때문에 저렇게 인스턴스 선언이 가능하다.
      ```

    - 멤버변수(인스턴스 필드)는 선언이 가능하다. 따라서, 추상클래스를 상속 받은 일반 클래스는 추상클래스의 인스턴스 필드를 바로 사용할 수 있다.

    ```
     public abstract class AbstractClass {
      int a = 20;
      int b = 20;
    
    }
    
    class SubClass extends AbstractClass {
      int a, b;
    
      void m() {
        System.out.printf("변경 전, a의 값 : %d\n", a); // 0
        System.out.printf("변경 전, b의 값 : %d\n", b); // 0
        a = 10;
        b = 10;
        System.out.printf("변경 후, a의 값 : %d\n", a); // 10
        System.out.printf("변경 후, b의 값 : %d\n", b); // 10
      }
    }
    ```

    위 코드의 결과는 0, 0 -> 10, 10 이다. 우선, 현재 a는 SubClass의 a를 가리킨다. 초기화하지 않는 멤버변수는 타입에 따라 null 혹은 0, 0.0의 값을 갖는다. 즉, a는 int형이기 때문에 0의 값으로 초기화되고, 변경 전의 값은 0이다. 만일, a를 super.a로 한다면, 결과는 20으로 나온다. 현재 클래스를 건너 뛰고 올라가서 a를 찾고 있으면 그 a의 값을 불러 오기 때문이다. this.a를 한다 해도 결과는 여전히 0일 것이다. 이유는 현재의 클래스에서 올라가기 때문이다.

- 인터페이스

  - 인터페이스는 일종의 추상 클래스이다. (자바의 정석 인용)

    - 추상 클래스와의 차이점은 인터페이스의 구현체는 메소드 몸체를 가질 수 없으며 또한, 멤버변수도 구현이 불가능하다.
    - 정적 메소드를 구현할 경우, 메소드 몸체 안에 변수를 선언할 수 있지만, 변수는 상수로 바뀌게 된다.

  - 인터페이스의 구현체는 추상메소드이며, 인터페이스를 구현하는 클래스는 반드시, 메소드를 전부 오버라이딩해서 사용해야 한다. 다만, default 메소드는 예외이다.

    default 메소드란, 인터페이스의 일반 메소드라고 보면 된다. 추상클래스의 추상메소드 = 구현 필수, 일반메소드 = 구현 선택. 인터페이스의 추상메소드 = 구현 필수, default메소드 = 구현 선택. 즉, 인터페이스를 구현하는 클래스들 중에서 선택적으로만 구현이 가능하다. 그래서 모든 클래스가 인터페이스의 새로운 메소드를 전부 다 구현할 필요가 사라진다.

    ```
    interface A {
      default void method() {};
      여기서 한 가지 다른 점은
      추상메소드는 (); 로 끝나지만, default메소드는
      () {};로 끝난다.
      즉, 메소드 몸체까지 선언을 해야 된다.
    }
    ```

  - 다중 상속 가능

    - 인터페이스는 다중상속이 가능하다. 하나의 클래스에서 두 개 이상의 인터페이스를 구현할 수 있다.

      ```
      class A implements B, C, D {}
      ```

  - 동시 상속 / 구현

    - 한 클래스에 클래스와 인터페이스 두 가지를 동시에 상속 받을 수 있다.
    - 일반 클래스가 추상클래스와 인터페이스를 동시에 상속 받았다고 가정해보자.

    ```
    class NormalClass extends AbstractClass implements Interface {
      이런 식으로 이루어지는데,
      추상클래스의 추상메소드가 있다면, 반드시 구현해야 하며,
      인터페이스의 추상메소드 또한, 반드시 구현해야 한다.
    }
    ```

  - 인터페이스 <- 추상클래스 <- 일반클래스

    - 일반클래스는 추상클래스를 상속 받고, 추상클래스는 인터페이스를 상속 받는다.

    - 우선, 추상클래스에 추상메소드가 없다고 가정하고, 인터페이스의 구현체만 오버라이딩해서 사용한다면, 추상클래스 혹은 일반클래스 둘 중 한 곳에서만 선언만 하면 된다. 두 곳에서 선언할 필요가 없다. 오히려 쓸모가 없다. 추상클래스는 상속을 위한 클래스인데 인터페이스의 구현체를 받아서 재정의할 이유가 없다.

      ```
      interface Inter {
        void method();
      }
      abstract class Abs implements Inter {
        여기서 method()를 오버라이딩해봤자 의미가 없다.
      }
      class Sub extends Abs {
        여기서 method()를 오버라이딩해야 사용의 의미가 있다.
      }
      ```

      물론, 위처럼 단순 한 개를 위한 메소드라면, 추상클래스가 필요가 없다. 하지만, 다양한 기능이 들어있는 인터페이스라면, 골라서 사용할 수 있는 장점이 있다.

  - 익명 클래스로 인스턴스 생성하기

    - 인터페이스 자체를 인스턴스로 생성이 불가능하지만, 익명 클래스로는 생성이 가능하다. 익명 클래스로 생성을 한 후, 구현체를 오버라이딩해서 사용할 수 있다.

      ```
      interface Inter {
        void method();
      }
      
      class A implements Inter {
        @Override
        void method() {
          System.out.println("Inter의 method()");
        }
      }
      
      public class Main {
        public static void main(String[] args) {
          Inter inter = new Inter() {
            @Override
            void method() {
              System.out.println("method() 오버라이딩");
            }
          };
      
          inter.method();
          위 결과는 "method() 오버라이딩" 이고,
          
          A a = new A();
          a.method();
          위 결과는 "Inter의 method()" 가 된다.
      
          아니면, 다형성을 이용해서 선언한 다음 사용도 가능하다.
          Inter b = new A();
          b.method();
          위 결과는 a.method() 와 동일하다.
        }
      }
      ```



■ 2021-04-03 (4일차)


■ 2021-04-10 (5일차)


■ 2021-04-17 (6일차)


■ 2021-04-24 (7일차)


■ 2021-05-01 (8일차)