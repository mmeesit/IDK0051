package studentsystem;

public class Student {
    private String name;
    private int birthYear;
    private int points;
    private String curriculum;

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, String curriculum) {
        this.name = name;
        this.curriculum = curriculum;
    }


    public int getPoints() {
        return points;
    }

    public void addPoints(int points) {
        this.points = points;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
}
