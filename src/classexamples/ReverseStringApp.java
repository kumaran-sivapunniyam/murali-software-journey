package classexamples;

public class ReverseStringApp {
	
	

	public static String reverse(String str) {
		String reversed = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			char c = str.charAt(i);

			reversed = reversed + c;

		}

		return reversed;
	}

}
