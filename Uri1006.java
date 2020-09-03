package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
        double notaA = entrada.nextDouble();
        double notaB = entrada.nextDouble();
        double notaC = entrada.nextDouble();
        double MEDIA;
        MEDIA = (notaA*2 + notaB*3 + notaC*5)/10;
        System.out.printf("MEDIA = %.1f\n",MEDIA);
        entrada.close();

	}

}
