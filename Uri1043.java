package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double num1 = input.nextDouble();
		double num2 = input.nextDouble();
		double num3 = input.nextDouble();
		double perimetro = num1 + num2 + num3;
		double area = (num1 + num2) / 2 * num3;
		
		if (num1 + num2 > num3 && num2 + num3 > num1 && num1 + num3 > num2) {
			System.out.printf("Perimetro = %.1f\n", perimetro);
		}
		else {
			System.out.printf("Area = %.1f\n", area);
		}
		
		input.close();
	}

}
