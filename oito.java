import java.util.Scanner;

public class oito {

	public static void main(String[] args) {
		// Exerc�cio 08
		// Autor: Sara Ferreira
		// Data: 02/06/2021
		
		Scanner entrada = new Scanner(System.in);
		int a = 29, b = 47;
		double c, d, e, f;
		
		System.out.println("Informe o custo de f�brica: ");
		c = entrada.nextDouble();
		
		d = c+ (c*a/ 100);
		e = c + (c*b/ 100);
		f = c + d + e;
		
		System.out.println("O custo ao consumidor �: " + f);

		
	}

}
