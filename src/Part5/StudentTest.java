package Part5;

public class StudentTest {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.setStudentName("이상원");
        System.out.println(studentLee.serialNum);
        studentLee.serialNum++;

        System.out.println(studentLee.getStudentName());
        System.out.println(studentLee.serialNum);
    }
}
