package Lab5;
import java.util.Scanner;

public class RectangleArray {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of rectangle :" );
		int n = s.nextInt();
		String line; 
		
		for(int i = 0 ; i < n ; i++) {
			line = "";
			for (int j = 0 ; j < n ; j++) {
				if(i==j) {
					line += "x";
				}
				else {
					line += "o";
				}
			}System.out.println(line);
		}
	}
}
