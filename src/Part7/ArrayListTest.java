package Part7;
import java.util.ArrayList;  //ArrayList 클래스 import

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Book> libary = new ArrayList<Book>();  //ArrayList 선언

        libary.add(new Book("태백산맥", "조정래"));  //add() 메서드로 요소 값 추가
        libary.add(new Book("데미안", "헤르만 헤세"));
        libary.add(new Book("어떻게 살 것인가", "유시민"));
        libary.add(new Book("토지", "박경리"));
        libary.add(new Book("어린왕자", "생텍쥐페리"));

        for(int i=0; i<libary.size(); i++) {  //배열에 추가된 요소 개수만큼 출력
            Book book = libary.get(i);
            book.showBookInfo();
        }
        System.out.println();

        System.out.println("=== 향상된 for문 사용 ===");
        for(Book book : libary) {
            book.showBookInfo();
        }
    }
}
