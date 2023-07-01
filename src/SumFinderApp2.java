import java.util.Scanner;

public class SumFinderApp2 {

	public static void main(String args[]) {

		// int numbers[] = { 45, 67, 22, 46, 78, 34, 56, 77, 78, 33 };

		
		
		int numbers[] = new int[5];

		Scanner sc = new Scanner(System.in);
		
		for(int x=0; x<numbers.length; x++) {
			numbers[x] = sc.nextInt();
		}

		sc.close();
		
		
		
		int biggestNumber = numbers[0];

		int smallestNumber = numbers[0];

		for (int i = 1; i < numbers.length; i++) {

			if (biggestNumber < numbers[i]) {
				biggestNumber = numbers[i];
			}

			if (smallestNumber > numbers[i]) {
				smallestNumber = numbers[i];
			}

		}

		System.out.println("Biggest of all : " + biggestNumber);
		System.out.println("Smallest of all : " + smallestNumber);

	}
}
