
public class StudentInfo {
	private String name;
	private int yearOfG;
	private int finalAverage;

	public StudentInfo(String n, int y, int a) {
		name = n;
		yearOfG = y;
		finalAverage = a;
	}

	public String getName() {
		return name;
	}

	public int getYearOfG() {
		return yearOfG;
	}

	public int getFinalAverage() {
		return finalAverage;
	}

	void printInfo() {
		System.out.println("\nName: " + name);
		System.out.println("Year of Graduation: " + yearOfG);
		System.out.println("Final Average: " + finalAverage);
	}
}
