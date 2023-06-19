
public class TypeCastingDemo {
	
	public static void main(String args[]) {
		
		System.out.println("Integer Range :: " + Integer.MIN_VALUE + " *** " + Integer.MAX_VALUE);
		
		System.out.println("Long Range    :: " + Long.MIN_VALUE + " *** " + Long.MAX_VALUE);
		
		long x = 50;
		
		
		
		long l = 21474836508688L;
		
		//l = x; //AutoBoxing / Implicit Type Casting
		
		x = (int) l; //Explicit Type Casting
		
		
		
		System.out.println("x = " + x);
		
		
		
		
		
	}

}
