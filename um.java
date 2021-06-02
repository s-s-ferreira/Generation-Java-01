import java.util.Scanner;

public class um {

	public static void main(String[] args) {
		// Exercício 01
		// Autor: Sara Ferreira
		// Data: 02/06/2021
		
		Scanner entrada = new Scanner(System.in);
		int idadeAnos, idadeMeses, idadeDias, totalDias = 0;
		
		System.out.println("Quantos anos? ");
		idadeAnos = entrada.nextInt();
		
		System.out.println("Quantos meses? ");
		idadeMeses = entrada.nextInt();
		
		System.out.println("Quantos dias? ");
		idadeDias = entrada.nextInt();
		
		totalDias = totalDias + (idadeAnos*365);
		totalDias = totalDias + (idadeMeses*30);
		totalDias = totalDias + idadeDias;
		
		System.out.println("A idade em dias é: " + totalDias);

	}

}
