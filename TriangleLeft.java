package Lab5;
import java.util.Scanner;

public class TriangleLeft {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of the square : ");
		int n = s.nextInt();
		String line= ""; 
		//first print  "o" 
		//second print "oo"
		//third print  "ooo"
		for (int i = 0 ; i < n ; i ++) {
			line += "o";
			System.out.println(line);
		}
	}
}
