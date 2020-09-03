package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		double B = input.nextDouble();
		double C = input.nextDouble();
		double delta = (Math.pow(B, 2)) - (4 * A * C);
		if (delta <= 0) {
			System.out.println("Impossivel calcular");
		}
		else if (A == 0) {
			System.out.println("Impossivel calcular");
		}
		else {
			double r1 = (-B + Math.sqrt(delta)) / (2*A);
			double r2 = (-B - Math.sqrt(delta)) / (2*A);
			System.out.printf("R1 = %.5f\n", r1);
			System.out.printf("R2 = %.5f\n", r2);
		}
		
		input.close();
	}

}
