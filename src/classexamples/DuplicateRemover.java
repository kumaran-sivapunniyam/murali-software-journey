package classexamples;

public class DuplicateRemover {

	/*
	 * Method Signature
	 * 
	 * name : removeDuplicates arg1 : int[] arg2 : int
	 * 
	 * return int[]
	 * 
	 */
	
	//non static method / member method
	public int[] removeDuplicates(int[] arr, int count) {

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

			// To avoid ArrayIndexOutOfBoundException
			if (i != count) {
				next = arr[i];
			}

		} while (i < count);

		j = j + 1;
		int temp2[] = new int[j];

		for (int x = 0; x < j; x++) {
			temp2[x] = temp[x];
		}

		return temp2;

	}

	public static String[] removeDuplicates(String[] arr, int count) {

		if (count == 0 || count == 1) {
			return arr;
		}

		String temp[] = new String[count];

		int i = 0;
		int j = 0;

		temp[j] = arr[i];

		String previous = null;

		String next = null;

		previous = arr[i];
		next = arr[++i];

		do {
			if (!next.equals(previous)) {

				j = j + 1;
				temp[j] = next;

			}

			previous = next;

			i = i + 1;

			// To avoid ArrayIndexOutOfBoundException
			if (i != count) {
				next = arr[i];
			}

		} while (i < count);

		j = j + 1;
		String temp2[] = new String[j];

		for (int x = 0; x < j; x++) {
			temp2[x] = temp[x];
		}

		return temp2;

	}

}
