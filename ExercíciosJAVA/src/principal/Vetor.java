//Ler um vetor Q de 20 posições (aceitar somente números positivos), caso não atenda a condição 
//deve informar novamente o numero até que a condição seja aceita, ao final mostre os números 
//inseridos no vetor e a soma deles.

package principal;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [] numeros = new int[20];
		for(int contador = 1; contador < 21; contador++) {
			System.out.println(contador);
		}
		leia.close();

	}

}
