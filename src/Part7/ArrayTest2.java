package Part7;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] date = new double[5];  //double형으로 길이 5인 배열 선언

        date[0] = 10.0;  //첫 번째 요소에 값 10.0 대입
        date[1] = 20.0;  //두 번째 요소에 값 20.0 대입
        date[2] = 30.0;  //세 번째 요소에 값 30.0 대입

        for (int i=0; i<date.length; i++) {
            System.out.println(date[i]);
        }
    }
}
