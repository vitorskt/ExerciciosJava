package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double pi = 3.14159;
		int raio = input.nextInt();
		double volume = (4.0/3) * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f\n", volume);
		input.close();

	}

}
