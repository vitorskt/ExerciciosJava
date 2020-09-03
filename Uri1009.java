package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nome = input.next();
		double salario = input.nextDouble();
		double TotalVendas = input.nextDouble();
		double total = salario + (0.15*TotalVendas);
		
		System.out.printf("TOTAL = %.2f\n", total);
		input.close();
	}

}
