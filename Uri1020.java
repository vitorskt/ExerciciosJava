package curso_programacao;

import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int totdias = input.nextInt();

		int anos = totdias / 365;
		totdias %= 365;

		int mes = totdias / 30;
		totdias %= 30;

		int dias = totdias;

		System.out.printf("%d ano(s)\n", anos);
		System.out.printf("%d mes(es)\n", mes);
		System.out.printf("%d dia(s)\n", dias);

		input.close();
	}

}
