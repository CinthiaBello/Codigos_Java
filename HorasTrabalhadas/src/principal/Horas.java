/*
 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
 * Calcule e mostre o total do seu salário no referido mês (sem descontos e impostos).
 */
package principal;

import java.util.Scanner;

public class Horas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double horas = 0;
		double valorHora = 0;
		
		System.out.println("Valor da hora: ");
		valorHora = leia.nextDouble();
		System.out.println("Horas trabalhadas: ");
		horas = leia.nextDouble();
		
	    System.out.println("Total do salário: " + (valorHora * horas));
	    
	    leia.close();
		

	}

}
