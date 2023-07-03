package classexamples;

public class CharacterCounterApp {

	public static void main(String[] args) {

		String name = "Kumaraxyzan";
		

//		int i1 = name.indexOf(ch);
//		System.out.println("i1= " + i1);
//
//		int i2 = name.lastIndexOf(ch);
//		System.out.println("i2= " + i2);

//		System.out.println(name.charAt(4));
//
//		System.out.println(name.length());

		int count = 0;
		
		for (int i = 0; i < name.length(); i++) {

			char c = name.charAt(i);
			
			if(c == 'a') {
				System.out.println(" a appears at " + i);
				count++;
			}
		}
		
		System.out.println("Count of a = " + count);

	}

}
