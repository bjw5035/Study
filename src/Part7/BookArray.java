package Part7;

public class BookArray {
    public static void main(String[] args) {
        Book[] libary = new Book[5];

        libary[0] = new Book("태백산맥", "조정래");
        libary[1] = new Book("데미안", "레므나 헤세");
        libary[2] = new Book("어떻게 살 것인가", "유시민");
        libary[3] = new Book("토지", "박경리");
        libary[4] = new Book("어린왕자", "생텍쥐페리");

        for(int i=0; i<libary.length; i++) {
            libary[i].showBookInfo();
        }
        for(int i=0; i<libary.length; i++) {
            System.out.println(libary[i]);
        }
    }
}
