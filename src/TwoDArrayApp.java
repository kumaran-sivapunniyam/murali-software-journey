
public class TwoDArrayApp {

	public static void main(String[] args) {
		
		int[][] x = {
				{ 1, 3, 5, 7, 9 },
				{ 2, 4, 6, 8, 10 }
		};
		
		for(int c=0; c<5; c++) {
			for(int r=0; r<2; r++) {			
				System.out.println(x[r][c]);
			}
		}

	}

}
