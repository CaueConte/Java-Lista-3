package exercicioswhile3;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while((x != 0) && (y != 0)) {
			System.out.printf("x: %d%n", x);
			System.out.printf("y: %d%n", y);
			if((x > 0) && (y > 0)) {
				System.out.println("q1");
			}
			else if((x < 0) && (y > 0)) {
				System.out.println("q2");
			}
			else if ((x < 0) && ( y < 0)) {
				System.out.println("q3");
			}
			else if ((x > 0) && (y < 0)) {
				System.out.println("q4");
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.println("vlaor nulo");

	}

}
