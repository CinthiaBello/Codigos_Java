package principal;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		//Fa�a um programa que receba um valor em real e converta para d�lares na cota��o atual,
		//fa�a o inverso tamb�m;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor em real: ");
		double real = leia.nextDouble();
		System.out.printf("Convertido para dolar: %.2f ", conversao(real));
		
		
		leia.close();

	}
	static double conversao(double real) {
		return real * 4.99;
		
	}

}
