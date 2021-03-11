import java.util.*;

public class SelectionSort {
	static Scanner sc;

	public static void main(String[] args) throws InputMismatchException {
		AllStudents a;
		while(true) {
			sc = new Scanner(System.in);
			try {
				System.out.println("How many students do you want to input? (1-15)");
				int count = sc.nextInt();
				if(count < 1 || count > 15) {
					System.out.println("Make sure input isn't less than 1 or greater than 15");
					continue;
				}
				a = new AllStudents(count);
				for(int i = 0; i < count; i++) {
					a.add(i);
				}
				break;
			} catch (InputMismatchException e) {
				System.out.println("Make sure input is an integer");
			}
		}
		while(true) {
			sc = new Scanner(System.in);
			try {
				System.out.println("\nEnter in number for the corresponding option");
				System.out.println("1. Print all students in order by name");
				System.out.println("2. Print all students in order by final average");
				System.out.println("3. End program");
				int option = sc.nextInt();
				if(option < 1 || option > 3) {
					System.out.println("Make sure input is between 1 and 3");
					continue;
				}
				if(option == 1) a.printName();
				else if(option == 2) a.printFinalAverage();
				else {
					sc.close();
					System.out.println("Program ended");
					return;
				}
			} catch (InputMismatchException e) {
				System.out.println("Make sure input is an integer");
			}
		}
	}
}
