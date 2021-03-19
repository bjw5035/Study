package Part7;

public class StudentArray {
    public static void main(String[] args) {
        Student[] f1 = new Student[3];

        f1[0] = new Student("James", "1001");
        f1[1] = new Student("Tomas", "1002");
        f1[2] = new Student("Edward", "1003");

        for(int i=0; i<f1.length; i++) {
            f1[i].showStudentInfo();
        }
//        for(int i=0; i<f1.length; i++) {
//            System.out.println(f1[i]);
//        }
    }
}
