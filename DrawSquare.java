package Lab5;
import java.util.Scanner;

public class DrawSquare {
	public static void main(String []args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Size of the square : ");
		int n = s.nextInt();
		int i = 0 ;
		String line = "";
		
		
		while(i < n) {
			line += "o";
			i++;
			System.out.println(line);
		}		
		/*
		for(int i = 0 ; i < n ; i ++) {
			line += "o";		
		}
		for (int i = 0 ; i < n ; i ++ ) {
			System.out.println(line);
		}
		*/
	}
}
