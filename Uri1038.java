package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int cod = input.nextInt();
		int quant = input.nextInt();
		double preco;
		if (cod == 1) {
			preco = 4.00;
		}
		else if (cod == 2) {
			preco = 4.50;
		}
		else if (cod == 3) {
			preco = 5.00;
		}
		else if (cod == 4) {
			preco = 2.00;
		}
		else {
			preco = 1.50;
		}
		
		System.out.printf("Total: R$ %.2f\n", preco*quant);
		
		input.close();
	}

}
