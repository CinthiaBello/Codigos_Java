//Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos), caso n�o atenda a condi��o 
//deve informar novamente o numero at� que a condi��o seja aceita, ao final mostre os n�meros 
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
