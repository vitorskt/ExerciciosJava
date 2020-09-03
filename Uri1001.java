package curso_programacao;

import java.util.Scanner;

public class Uri1001 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int A, B, x;
		
		A = input.nextInt();
		B = input.nextInt();
		x = A + B;
		
		System.out.println("x = "+ x);
		
		input.close();

	}

}