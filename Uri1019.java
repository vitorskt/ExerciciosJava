package curso_programacao;

import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int totsegundos = input.nextInt();
		
		int horas = totsegundos / 3600;
		totsegundos %= 3600;
		
		int min = totsegundos / 60;
		totsegundos %= 60;
		
		int segundos = totsegundos;
		
		System.out.printf("%d:%d:%d\n", horas, min, segundos);
		
		input.close();
	}

}
