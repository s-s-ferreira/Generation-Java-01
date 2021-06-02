import java.util.Scanner;

public class cinco {

	public static void main(String[] args) {
		// Exercício 05
		// Autor: Sara Ferreira
		// Data: 02/06/2021
		
		Scanner entrada = new Scanner(System.in);
		double n1, n2, n3;
		double p1, p2, p3;
		double media;
		
		System.out.println("Escreva a primeira nota: ");
		n1 = entrada.nextDouble();
		System.out.println("Escreva o peso da primeira nota: ");
		p1 = entrada.nextDouble();
		
		System.out.println("Escreva a segunda nota: ");
		n2 = entrada.nextDouble();
		System.out.println("Escreva o peso da segunda nota: ");
		p2 = entrada.nextDouble();
		
		System.out.println("Escreva a terceira nota: ");
		n3 = entrada.nextDouble();
		System.out.println("Escreva o peso da terceira nota: ");
		p3 = entrada.nextDouble();
		
		media = (n1*p1 + n2*p2 + n3*p3) / (p1+p2+p3);
		
		System.out.println("A média do aluno é: " + media);
	}

}
