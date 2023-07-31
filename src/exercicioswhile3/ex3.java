package exercicioswhile3;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		while (a != 4) {
			a = sc.nextInt();
			switch(a) {
				case 1:
					alcool += 1;
					break;
				case 2:
					gasolina = gasolina + 1;
					break;
				case 3:
					diesel = diesel + 1;
					break;
				default:
					System.out.println("obr");
			}
			

			System.out.println("alcool " + alcool);
			System.out.println("gasolina " + gasolina);
			System.out.println("diesel " + diesel);
			
			
		}
		

	}

}
