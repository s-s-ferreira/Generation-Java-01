import java.util.Scanner;

public class oito {

	public static void main(String[] args) {
		// Exerc�cio 08
		// Autor: Sara Ferreira
		// Data: 02/06/2021
		
		Scanner entrada = new Scanner(System.in);

		double a, b, c;
		
		System.out.println("Informe o custo de f�brica: ");
		a = entrada.nextDouble();
		
		c = a + (a*0.28);
		b = c + (c*0.45);
		
		System.out.println("O custo ao consumidor �: " + b);

		
	}

}
