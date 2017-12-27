package student;

/**
 * Created by ets on 6.09.17.
 */
public class Student {
    private String studentName;
    private int birthYear;
    private int points;
    private String studies;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(String studentName, String studies) {
        this.studentName = studentName;
        this.studies = studies;
    }

    public void addBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getStudies() {
        return studies;
    }
}
