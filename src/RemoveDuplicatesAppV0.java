
import java.util.Scanner;

public class RemoveDuplicatesAppV0 {

	public static void main(String[] args) {

		int arr[] = readNumbers();

		System.out.print("Original Array: ");
		// int length = arr.length;
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		// getting the new array size after removing duplicates
		arr = removeDuplicates(arr, arr.length);

		// for new line
		System.out.println("");

		// Displaying array with non-duplicate elements
		System.out.print("Array after removing duplicate elements: ");
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	public static int[] removeDuplicates(int arr[], int count) {
		if (count == 0 || count == 1) {
			return arr;
		}
		// creating a temporary array to hold non-duplicate elements
		int[] temp = new int[count];
		int j = 0;
		for (int i = 0; i < count - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				temp[j++] = arr[i];
			}
		}
		temp[j++] = arr[count - 1];

		int x[] = new int[j];
		// copying the temp array to the original array
		for (int i = 0; i < j; i++) {
			x[i] = temp[i];
		}
		return x;
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
