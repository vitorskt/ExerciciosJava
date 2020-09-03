package curso_programacao;

import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int horas = input.nextInt();
		double velocidade = input.nextInt();
		double resultado = (horas*velocidade) / 12;
		
		System.out.printf("%.3f\n",resultado);
		input.close();
	}

}
