package exercicioswhile3;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("");
		Scanner sc = new Scanner(System.in);
		
		int senhaCorreta = 2002;
		int senha = 0;
		while(senha != senhaCorreta) {
			System.out.println("senha incorreta");
			senha = sc.nextInt();
		}
		System.out.println("pass");
				

	}

}
