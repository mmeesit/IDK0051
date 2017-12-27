import student.Student;

/**
 * Created by ets on 6.09.17.
 */
public class Main {
    public static void main(String[] args) {
        Student first = new Student("Martin");
        first.addBirthYear(1992);

        Student second = new Student("Kati");
        second.addBirthYear(1995);

        Student third = new Student("Priit");
        third.addBirthYear(1993);

        Student fourth = new Student("Elmar", "IAPB");

        System.out.println(first.getStudentName() + " is born on: " + first.getBirthYear());
        System.out.println(second.getStudentName() + " is born on: " + second.getBirthYear());
        System.out.println(third.getStudentName() + " is born on: " + third.getBirthYear());
        System.out.println(fourth.getStudentName() + " is studying: " + fourth.getStudies());
    }
}
