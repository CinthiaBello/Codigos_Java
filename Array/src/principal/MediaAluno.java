/*Faça um programa que receba o nome do 
 * aluno e as 4 notas bimestrais desse aluno,
 *  mostre a media e se foi aprovado (>=7) ou reprovado(<7)
 */
package principal;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome = "";
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		double [] notas = new double[4];
		for(int contador = 0; contador < notas.length; contador++) {
			System.out.println("Digite sua nota: ");
			notas[contador] = leia.nextInt();
		}
		for(double nota : notas ) {
			System.out.println(nota);
		}
		
		System.out.println("Sua média: " + ((notas[0] + notas[1] + notas[2] +notas[3])/ 4));
		
		
		leia.close();
		

	}

}
