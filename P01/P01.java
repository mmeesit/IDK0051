public class P01 {
	public static void main (String[] args) {
		System.out.println("See on staatiline meetod, see ei ole objekt. Uhtlasi on see main meetod.");
		StudentProc.addStudent("Teldo");
		StudentProc.addPoints("Teldo", 10);
		StudentProc.addPoints("Teldo", -20);
		System.out.println(StudentProc.getPoints("Teldo"));
		StudentProc.addStudent("Joonas");
		StudentProc.addPoints("Joonas", 30);
		System.out.println(StudentProc.getPoints("Joonas"));
		StudentProc.addStudent("Pets");
		StudentProc.addPoints("Pets", 30);
		System.out.println(StudentProc.getPoints("Pets"));
		StudentProc.addStudent("Pets");
		StudentProc.addPoints("Pets", 50);
		System.out.println(StudentProc.getPoints("Pets"));


		Student edgar = new Student("Edgar");
		edgar.addPoints(50);
		System.out.println(edgar.getName());
		System.out.println(edgar.getPoints());
		edgar.addPoints(-10);
		System.out.println(edgar.getPoints());


		Student toomas = new Student("Toomas");
		toomas.addPoints(90);
		System.out.println(toomas.getName());
		System.out.println(toomas.getPoints());
		toomas.addPoints(-10);
		System.out.println(toomas.getPoints());


		Student kati = new Student("Kati");
		kati.addPoints(30);
		System.out.println(kati.getName());
		System.out.println(kati.getPoints());

		Student katiTeine = new Student("Kati");
		katiTeine.addPoints(50);
		System.out.println(katiTeine.getName());
		System.out.println(katiTeine.getPoints());
	}
}