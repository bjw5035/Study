package Part7;

public class ArrayTest3 {
    public static void main(String[] args) {
        double[] date = new double[5];  //double형으로 길이 5인 배열 선언
        int size = 0;  //유효한 값이 저장된 배열 요소 개수를 저장할 변수 선

        date[0] = 10.0; size++;  //첫 번째 요소에 값 10.0 대입
        date[1] = 20.0; size++; //두 번째 요소에 값 20.0 대입
        date[2] = 30.0; size++; //세 번째 요소에 값 30.0 대입

        for (int i=0; i<size; i++) {
            System.out.println(date[i]);
        }
    }
}
