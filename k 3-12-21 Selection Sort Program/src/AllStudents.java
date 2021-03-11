import java.util.*;

public class AllStudents {
	static Scanner sc;
	private StudentInfo[] a;

	public AllStudents(int s) {
		a = new StudentInfo[s];
	}

	public void add(int i) throws InputMismatchException {
		String name;
		int yearOfG;
		int finalAverage;
		sc = new Scanner(System.in);
		System.out.println("\nInput name");
		name = sc.nextLine();
		while(true) {
			sc = new Scanner(System.in);
			try {
				System.out.println("Input year of graduation");
				yearOfG = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Make sure input is an integer");
			}
		}
		while(true) {
			sc = new Scanner(System.in);
			try {
				System.out.println("Input final average");
				finalAverage = sc.nextInt();
				if(finalAverage < 0 || finalAverage > 100) {
					System.out.println("Make sure input is between 0 and 100");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Make sure input is an integer");
			}
		}
		StudentInfo s = new StudentInfo(name, yearOfG, finalAverage);
		a[i] = s;
	}

	public void printName() {
		for(int i = 0; i < a.length - 1; i++) {
			int target = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[target].getName().compareTo(a[j].getName()) > 0) {
					target = j;
				}
			}
			swap(target, i);
		}
		for(int i = 0; i < a.length; i++) {
			a[i].printInfo();
		}
	}

	public void printFinalAverage() {
		for(int i = 0; i < a.length - 1; i++) {
			int target = i;
			for(int j = i + 1; j < a.length; j++) {
				if(a[target].getFinalAverage() < a[j].getFinalAverage()) {
					target = j;
				}
			}
			swap(target, i);
		}
		for(int i = 0; i < a.length; i++) {
			a[i].printInfo();
		}
	}

	public void swap(int target, int i) {
		StudentInfo temp = a[target];
		a[target] = a[i];
		a[i] = temp;
	}
}
