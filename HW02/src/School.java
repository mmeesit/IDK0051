import door.ElectronicLock;
import studentcard.StudentController;

/**
 * Created by ets on 14.09.17.
 */
public class School {
    public static void main(String[] args) {
        ElectronicLock reaal = new ElectronicLock("REAAL");
        ElectronicLock karlda = new ElectronicLock("KARLDA");
        ElectronicLock kardla = new ElectronicLock("KARDLA");
        ElectronicLock kapak = new ElectronicLock("KAPAK");
        ElectronicLock noo = new ElectronicLock("NOO");

        reaal.validateStudentCard("511111111111111111111");
        karlda.validateStudentCard("4111111111111111111");
        kardla.validateStudentCard("622222222223333333");
        kapak.validateStudentCard("522222222222222222");
        noo.validateStudentCard("523233333333333333");
        noo.validateStudentCard("11111111111111111115");
    }
}
