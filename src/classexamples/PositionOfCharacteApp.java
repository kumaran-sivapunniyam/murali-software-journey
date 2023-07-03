package classexamples;

public class PositionOfCharacteApp {

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

		for (int i = 0; i < name.length(); i++) {

			//System.out.println(name.charAt(i));
			
			char c = name.charAt(i);
			
			if(c == 'a') {
				System.out.println(" a appears at " + i);
			}
		}

	}

}
