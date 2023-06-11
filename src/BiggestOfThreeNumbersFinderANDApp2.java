
public class BiggestOfThreeNumbersFinderANDApp2 {

	public static void main(String args[]) {

		// Assignment
		int a = 6000;

		int b = 4000;

		int c = 5000;

		// <, > == : Relational Operators

		// FALSE block

		if (a > b && a > c) {

			System.out.println(" a is the biggest of three numbers.");

		} else {

			if (b > a && b > c) {

				System.out.println(" b is the biggest of three numbers.");

			} else {

				if (c > a && c > b) {

					System.out.println(" c is the biggest of three numbers.");

				}
			}
		}

		System.out.println("The End");

	}

}
