package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		int num, horas;
		double valor, salary;
		
		num = input.nextInt();
		horas = input.nextInt();
		valor = input.nextDouble();
		salary = valor * horas;
		
		System.out.println("NUMBER = "+ num);
		System.out.printf("SALARY = U$ %.2f\n", salary);
		
		input.close();
	}

}
