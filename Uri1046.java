package curso_programacao;

import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int tempo;
		
		if (inicio < fim) {
			tempo = fim - inicio;
		}
		else {
			tempo = (24 - inicio) + fim;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		sc.close();
	}

}
