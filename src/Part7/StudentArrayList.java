package Part7;
import java.util.ArrayList;

public class StudentArrayList {
    public static void main(String[] args) {
        ArrayList<Student> f1 = new ArrayList<Student>();

        f1.add(new Student("1001", "James"));
        f1.add(new Student("1002", "Tomas"));
        f1.add(new Student("1003", "Edward"));

        for(int i=0; i<f1.size(); i++) {
            f1.get(i).showStudentInfo();
        }
    }
}
