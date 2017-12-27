package door;

import studentcard.StudentController;

import java.math.BigInteger;

/**
 * Created by ets on 13.09.17.
 */
public class ElectronicLock {
    private StudentController studentController = new StudentController();
    private String schoolId;

    public ElectronicLock(String schoolId) {
        this.schoolId = schoolId;
    }

    public boolean validateStudentCard(String idString) {
        if (studentController.isStudent(idString, schoolId)) {
            return true;
        } else {
            return false;
        }
    }
}
