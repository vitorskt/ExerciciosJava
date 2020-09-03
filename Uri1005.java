package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
        double nota1 = entrada.nextDouble();
        double nota2 = entrada.nextDouble();
        double MEDIA;
        MEDIA = (nota1*3.5 + nota2*7.5)/11;
        System.out.printf("MEDIA = %.5f\n",MEDIA);
        entrada.close();
	}

}
