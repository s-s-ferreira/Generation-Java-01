import java.util.Scanner;

public class sete {

	public static void main(String[] args) {
		// Exercício 07
		// Autor: Sara Ferreira
		// Data: 02/06/2021
		
		Scanner entrada = new Scanner(System.in);
		double a, b, c, d, e, f, x, y;
		
		System.out.println("Digite o valor de A: ");
		a = entrada.nextDouble();
		
		System.out.println("Digite o valor de B: ");
		b = entrada.nextDouble();
		
		System.out.println("Digite o valor de C: ");
		c = entrada.nextDouble();
		
		System.out.println("Digite o valor de D: ");
		d = entrada.nextDouble();
		
		System.out.println("Digite o valor de E: ");
		e = entrada.nextDouble();
		
		System.out.println("Digite o valor de F: ");
		f = entrada.nextDouble();
		
		x = ((c*e) - (b*f)) / ((a*e) - (b*d));

		y = ((a*f) - (c*d)) / ((a*e) - (b*d));
		
		System.out.println("O valor de X é: " + x);
		System.out.println("O valor de Y é: " + y);
	}

}
