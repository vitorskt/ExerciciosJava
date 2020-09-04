package curso_programacao;

import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        int hora_start = entrada.nextInt();
        int minu_start = entrada.nextInt();
        int all_minu_start = hora_start * 60 + minu_start;

        int hora_end = entrada.nextInt();
        int minu_end = entrada.nextInt();
        int all_minu_end = hora_end * 60 + minu_end;

        int all_minu_dif = (24 * 60 - all_minu_start) + all_minu_end;

        int horas = all_minu_dif / 60;
        int minutos = all_minu_dif % 60;

        if (horas >= 24 && minutos >= 1) {
            horas = horas % 24;
        };

        System.out.printf("O JOGO DUROU %s HORA(S) E %s MINUTO(S)\n", horas, minutos);
        entrada.close();
	}

}
