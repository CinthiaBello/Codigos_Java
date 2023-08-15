package principal;

import java.util.Scanner;

public class CalcularMetroQuadrado {

	public static void main(String[] args) {
		//Crie um programa que receba os valores de largura e comprimento do terreno e informa quantos 
		//metros quadrados ele tem.
		//Utilize funções
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a largura: ");
		double lar = leia.nextDouble();
		System.out.println("Digite O Comprimento: ");
		double comp = leia.nextDouble();
		System.out.printf("Metros quadrados do terreno: %.2f " ,  calculoMetroQuadrado(lar, comp));
		
		leia.close();
		
	}
	static double calculoMetroQuadrado(double lar, double comp) {
		return lar * comp;
		
	}

}
