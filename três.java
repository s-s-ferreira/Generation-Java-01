import java.util.Scanner;

public class tr�s {

	public static void main(String[] args) {
		// Exerc�cio 03
		// Autor: Sara Ferreira
		// Data: 02/06/2021
		
		Scanner entrada = new Scanner(System.in);
		int horas, minutos, segundos;
		
		System.out.println("Informe a dura��o do evento em segundos: ");
		segundos = entrada.nextInt();
		
		horas = segundos/3600;
		minutos = (segundos%3600)/60;
		segundos = (segundos%3600)%60;
		
		System.out.println("O evento durou: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

	}

}
