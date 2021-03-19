package Part7;
import java.util.ArrayList;


// 추후에 다시 하기(227p)
public class SchoolStudent {
    public String studentID;
    public String studentName;
    ArrayList<SchoolSubject> subjects;  //ArrayList 선언

    public SchoolStudent(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
        subjects = new ArrayList<>(subjects);  //ArrayList 생성하기
    }
}
