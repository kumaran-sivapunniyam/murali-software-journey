package classexamples;

public class StringDisplayApp {

	public static void main(String[] args) {
		
		String name = "Kumaran";
		
		//1. Upper case
		System.out.println("name in Upper Case = " + name.toUpperCase());
		
		//2. Lower case
		System.out.println("name in Lower Case = " + name.toLowerCase());
		
		//3. Reverse
		System.out.println("name in Reverse = " + ReverseStringApp.reverse(name));

	}

}
