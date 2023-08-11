//Ler um vetor Q de 20 posições (aceitar somente números positivos), caso não atenda a condição 
//deve informar novamente o numero até que a condição seja aceita, ao final mostre os números 
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
		//um contador para passar em todas as posiçõs 
		for(int contador = 0; contador < numeros.length; contador++) {
			System.out.println("Entre com o número: ");
			//somente números positivos
			while(numeros[contador] < 0 ) {
				System.out.println("Número inválido!");
				System.out.println("Entre com o número: ");
				numeros[contador] = leia.nextInt()
;			}
			//calculo de todos os numeros digitados
			soma+= numeros[contador];
		}
		// imprime a soma dos números e os números digitados
		System.out.println("A soma dos números " + soma);
		System.out.println("Números digitados: ");
		//lista dos numeros digiitados
		for (int numero : numeros) {
			System.out.println(numero);
		}
		leia.close();

	}

}
