package classexamples;

public class CharacterCounterApp {

	public static void main(String[] args) {

		String name = "Kumaran";

		int length = name.length();

		
		for (int i = length - 1; i >= 0; i--) {

			char c = name.charAt(i);

			System.out.print(c);

		}

		

	}

}
