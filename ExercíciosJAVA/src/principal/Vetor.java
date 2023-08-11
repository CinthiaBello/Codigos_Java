//Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos), caso n�o atenda a condi��o 
//deve informar novamente o numero at� que a condi��o seja aceita, ao final mostre os n�meros 
//inseridos no vetor e a soma deles.

package principal;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//um vetor de 20 posicoes
		int [] numeros = new int[20];
		//Uma variavel para a soma
		int soma = 0;
		//um contador para passar em todas as posi��s 
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.println("Entre com o n�mero: ");
			//somente n�meros positivos
			while(numeros[contador] < 0 ) {
				System.out.println("N�mero inv�lido!");
				System.out.println("Entre com o n�mero: ");
				numeros[contador] = leia.nextInt()
;			}
			//calculo de todos os numeros digitados
			soma+= numeros[contador];
		}
		// imprime a soma dos n�meros e os n�meros digitados
		System.out.println("A soma dos n�meros " + soma);
		System.out.println("N�meros digitados: ");
		//lista dos numeros digiitados
		for (int numero : numeros) {
			System.out.println(numero);
		}
		leia.close();

	}

}
