import student.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    void playWithStudentStreams() {
        List<Student> students = Arrays.asList(
                new Student("martin", 4),
                new Student("eesel", 2),
                new Student("lol", 1),
                new Student("elisabeth", 4),
                new Student("malcolm", 2)
        );

        students.stream()
                .filter(s -> s.getName().contains("e") || s.getName().contains("i"))
                //.peek(System.out::println)
                .filter(s -> s.getGrade() >= 3)
                .forEach(s -> System.out.println(s));
                // sama mis .forEach(s -> System.out::println);
    }

    public static void main(String[] args) {
        new Demo().playWithStudentStreams();


    }
}
