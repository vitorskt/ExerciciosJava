package curso_programacao;

import java.util.Scanner;

public class Uri1016 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int x = input.nextInt();
		int min = x*2;
		
		System.out.printf("%d minutos\n", min);
		
		input.close();
	}

}
