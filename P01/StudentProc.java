import java.util.HashMap;
import java.util.Map;

public class StudentProc {
	private static Map<String, Integer> students = new HashMap<String, Integer>();

	public static void addStudent(String name) {
		students.put(name, 0);
	}

	public static void addPoints(String studentName, int pointToAdd) {
		// this need validating, if key exists, if not, create new
		if (students.containsKey(studentName)) {			
			students.put(studentName, students.get(studentName) + pointToAdd);
		} else {
			students.put(studentName, pointToAdd);
		}
	}

	public static int getPoints(String studentName) {
		return students.get(studentName);
	}
}