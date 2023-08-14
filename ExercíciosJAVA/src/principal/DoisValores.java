//Escreva um algoritmo para ler 2 valores e se algum dos valores for zero não aceite, deve ser lido
//um novo valor, imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 
//(utilize a estrutura de repetição que mais se adeque).
package principal;

import java.util.Scanner;

public class DoisValores {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor1 = 0;
		int valor2 = 0;
		double resultado = 0;
		
		//pede e lê o valor 1
		System.out.println("Digite o primeiro valor: ");
		valor1 = leia.nextInt();
		//pede e lê o valor 2
		System.out.println("Digite o segundo valor: ");
		valor2 = leia.nextInt();
		//os valoress não podem ser igual a zero
		while(valor1 == 0 && valor2 == 0) {
			System.out.println("Digite números diferente de zero!");
			System.out.println("Digite o primeiro valor: ");
			valor1 = leia.nextInt();
			System.out.println("Digite o segundo valor: ");
			valor2 = leia.nextInt();
			//calculo do valor1 e valor2
			resultado = valor1 / valor2;
						
		}
		//imprime o resultado
		System.out.println("Resultado: " + resultado);
		
		leia.close();

	}

}
