package curso_programacao;


import java.util.Scanner;

public class Uri1002 {

  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
		double pi = 3.14159;
		double raio = input.nextDouble();
		double area = pi * Math.pow(raio, 2);
		System.out.printf("A=%.4f", area);
		System.out.println();
		input.close();
  }

}