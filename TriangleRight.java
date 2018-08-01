package Lab5;
import java.util.Scanner; 

public class TriangleRight {
	public static void main(String[]args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Height of the triangle : ");
		int n = s.nextInt();
		String line ="";
		
		for(int i = 1; i <= n ; i ++) {
			for (int j = i ; j < n; j++) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("o");
			}
			System.out.println("");
		}
	}
}
