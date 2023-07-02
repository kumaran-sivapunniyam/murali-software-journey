import java.util.Arrays;
import classexamples.DuplicateRemover;

import java.util.Scanner;

public class RemoveDuplicatesAppV3 {
	
	//RemoveDuplicatesAppV3 ---> DuplicateRemover

	public static void main(String[] args) {

		int arr[] = readNumbers();

		System.out.print("Original Array: ");
		// int length = arr.length;
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		Arrays.sort(arr);
		// getting the new array size after removing duplicates
		
		DuplicateRemover dr = new DuplicateRemover();
		
		arr = dr.removeDuplicates(arr, arr.length);

		// for new line
		System.out.println("");

		// Displaying array with non-duplicate elements
		System.out.print("Array after removing duplicate elements: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
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
