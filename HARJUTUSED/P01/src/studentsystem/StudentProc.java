package studentsystem;

import java.util.HashMap;
import java.util.Map;

public class StudentProc {
    private static Map<String, Integer> students = new HashMap<>();

    public static void addStudent(String name) {
        students.put(name, 0);
    }

    public static void addPoints(String studentName, int pointsToAdd) {
        if (students.containsKey(studentName)) {
            students.put(studentName, students.get(studentName) + pointsToAdd);
        } else {
            students.put(studentName, pointsToAdd);
        }
    }

    public static int getPoints(String studentName) {
        return students.get(studentName);
    }
}
