public class Student {
	private String name;
	private int points = 0;
	
	public Student(String name) {
		this.name = name;
	}

	public void addPoints(int pointsToAdd) {
		points += pointsToAdd;
	}

	public int getPoints() {
		return points;
	}

	public String getName() {
		return name;
	}
}