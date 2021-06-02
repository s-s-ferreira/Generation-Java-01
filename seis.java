import java.util.Scanner;
import java.math.*;

public class seis {

	public static void main(String[] args) {
		// Exercício 06
		// Autor: Sara Ferreira
		// Data: 02/06/2021
		
		Scanner entrada = new Scanner(System.in);
		double x1, x2, y1, y2;
		double d;
		
		System.out.println("Calcular distância entre dois pontos: ");
		
		System.out.println("Qual o valor de X1? ");
		x1 = entrada.nextDouble();
		
		System.out.println("Qual o valor de X2? ");
		x2 = entrada.nextDouble();
		
		System.out.println("Qual o valor de Y1? ");
		y1 = entrada.nextDouble();
		
		System.out.println("Qual o valor de Y2? ");
		y2 = entrada.nextDouble();
		
		d = Math.sqrt((x2-x1)+(y2-y1)+2);
		
		System.out.println("A distância entre os dois pontos é: " + d);
		}

}
