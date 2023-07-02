import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicatesAppV1 {

	public static void main(String[] args) {

		int arr[] = readNumbers();

		System.out.print("Original Array: ");
		// int length = arr.length;
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		Arrays.sort(arr);
		// getting the new array size after removing duplicates
		arr = removeDuplicates(arr, arr.length);

		// for new line
		System.out.println("");

		// Displaying array with non-duplicate elements
		System.out.print("Array after removing duplicate elements: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	/*
	 * 
	 * 
	 * i A T 0 1 1 1 2 2 2 3 3 3 4 4 4 5 5 5 5 6 5 7 5
	 * 
	 * 
	 * previous = next;
	 * 
	 * next = arr[i];
	 * 
	 */

	public static int[] removeDuplicates(int arr[], int count) {
		if (count == 0 || count == 1) {
			return arr;
		}

		int temp[] = new int[count];

		int i = 0;
		int j = 0;

		temp[j] = arr[i];

		int previous = 0;

		int next = 0;

		previous = arr[i];
		next = arr[++i];

		do {
			if (next != previous) {
				j = j + 1;
				temp[j] = next;

			}

			previous = next;

			i = i + 1;
			
			//To avoid ArrayIndexOutOfBoundException
			if(i != count) {
				next = arr[i];
			}
			
		} while (i < count);
		
		j = j + 1;
		int temp2[] = new int[j];
		
		for(int x=0; x<j; x++) {
			temp2[x] = temp[x];
		}
		
		return temp2;

	}

	private static int[] readNumbers() {
		Scanner sc = new Scanner(System.in);

		// int arr[] = { 1, 2, 2, 3, 4, 5, 5, 5 };
		System.out.print("Enter the length of array: ");

		int length = sc.nextInt();

		int numbers[] = new int[length];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = sc.nextInt();
		}

		sc.close();
		return numbers;

	}

}
