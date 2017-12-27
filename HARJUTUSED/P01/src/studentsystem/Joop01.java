package studentsystem;

public class Joop01 {
    public static void main(String[] args) {
        System.out.println("Hello dickbag");
        System.out.println("########");

        StudentProc.addStudent("Yolo");
        StudentProc.addStudent("Sof");
        StudentProc.addStudent("Swagerson");

        StudentProc.addPoints("Yolo", 15);
        StudentProc.addPoints("Sof", 30);
        StudentProc.addPoints("Swagerson", 50);

        System.out.println(StudentProc.getPoints("Yolo"));
        System.out.println(StudentProc.getPoints("Sof"));
        System.out.println(StudentProc.getPoints("Swagerson"));

        Student tyra1 = new Student("Meeri");
        Student tyra2 = new Student("Jorss");
        Student tyra3 = new Student("Olle");

        tyra1.addPoints(50);
        tyra2.addPoints(100);
        tyra3.addPoints(180);

        System.out.println(tyra1.getPoints());
        System.out.println(tyra2.getPoints());
        System.out.println(tyra3.getPoints());

        tyra1.setBirthYear(1992);
        tyra2.setBirthYear(1999);
        tyra3.setBirthYear(1997);

        System.out.println(tyra1.getBirthYear());
        System.out.println(tyra2.getBirthYear());
        System.out.println(tyra3.getBirthYear());
    }
}
