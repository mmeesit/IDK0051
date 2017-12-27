package studentcard;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

/**
 * Created by ets on 13.09.17.
 */
public class StudentController implements StudentCard {
    private List<String> validSchools = Arrays.asList("MHG", "KARDLA", "NOO", "REAAL");
    private int[] validNumbers = {5, 6};

    @Override
    public boolean isStudent(String idString, String school) {
        int idFirstDigit = Integer.parseInt(idString.substring(0, 1));

        for (int tempNr : validNumbers) {
            if (tempNr == idFirstDigit) {
                if (validSchools.contains(school)) {
                    System.out.println(school + ", " + idString + " (saab sisse)");
                    return true;
                }
            }
        }

        System.out.println(school + ", " + idString + " (ei saa)");
        return false;
    }
}
