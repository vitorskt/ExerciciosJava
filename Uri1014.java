package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int distancia = input.nextInt();
		double km = input.nextDouble();
		double res = distancia / km;
		
		System.out.printf("%.3f km/l\n", res);
		input.close();

	}

}
