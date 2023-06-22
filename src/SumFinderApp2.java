
public class SumFinderApp2 {

	public static void main(String[] args) {

		int x = 1;
		
		int total = 0;
		
		total = calculateSum(x);
		
		//Check if the sum is EVEN or ODD
		
		int r = findReminder(total);
		
		if( r == 0) {
			
			System.out.println("Total is an EVEN number");
		}
		else {
			System.out.println("Total is an ODD nummber");
		}
		

	}

	public static int calculateSum(int y) {

		int sum = 0;

		for (int i = 0; i <= y; i++) {

			sum = sum + i;

		}

		System.out.println("Sum = " + sum);
		
		return sum;
	}
	
	
	public static int findReminder(int number) {
		
		return (number % 2);
	}

}
