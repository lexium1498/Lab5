package Lab5;

public class TwoDimArray {
	public static void main(String[]args) {
		// the dimensions of the arry 
		int m = 3, n =4 ; 
		
		// the array 
		String [][] a = new String [m][n];
		
		// an auxiliary variable to print the array
		String line;
		
		// fill the 2-dim array 
		for(int i = 0 ; i < m ; i ++) {
			for(int j = 0 ; j < n ; j++) {
				a[i][j] = " " + i + j ;
				
			}
		}
		//print the 2-dim array 
		for(int i = 0; i < m ; i++) {
			line = "";
			for(int j = 0 ; j < n ; j++) {
				line += a[i][j];
			}
			System.out.println(line);
		}
	}
}
