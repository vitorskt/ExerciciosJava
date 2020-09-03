package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1037 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double num = input.nextDouble();
		
		if (num >= 0 && num <= 25.0) {
			System.out.println("Intervalo [0,25]");
		}
		else if (num > 25 && num <= 50.0) {
			System.out.println("Intervalo (25,50]");
		}
		else if (num > 50 && num <= 75.0) {
			System.out.println("Intervalo (50,75]");
		}
		else if (num > 75 && num <= 100.0) {
			System.out.println("Intervalo (75,100]");
		}
		else {
			System.out.println("Fora de intervalo");
		}
		
		input.close();
	}

}
