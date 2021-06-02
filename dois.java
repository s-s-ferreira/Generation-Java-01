import java.util.Scanner;

public class dois {

	public static void main(String[] args) {
		// Exercício 02
		// Autor: Sara Ferreira
		// Data: 02/06/2021
		
		Scanner entrada = new Scanner (System.in);
		int a, m, d;
		
		System.out.println("Sua idade em dias: ");
		d = entrada.nextInt();
		
		a = d/365;
		m = (d%365)/30;
		d = (d%365)%30;
		
		System.out.println("Você tem: " + a + " anos, " + m + " meses e " + d + " dias.");

	}

}
