import java.util.Scanner;

public class ReadNumber {

	public static void main(String args[]) {

		Scanner scan = new Scanner(System.in);

		// This method reads the number provided using keyboard
		
		System.out.print("Enter number1 = ");
		int number1 = scan.nextInt();

		
		System.out.print("Enter number2 = ");
		int number2 = scan.nextInt();
		
		int t = number1 + number2; // + Arithmetic Operator
		System.out.println( "TOTAL = " + t); // + Concatenation Operator
		
		
		scan.close();
	}

}
