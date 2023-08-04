/*
 * Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em
 *  graus Celsius. C = 5 * ((F-32) / 9).
 */
package principal;

import java.util.Scanner;

public class Transformacao {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double fahrenheit = 0;
		double celsius = 0;
		
		System.out.println("Digite sua temperatura em Fahrenheit: ");
		fahrenheit = leia.nextDouble();
		
		celsius = 5 *((fahrenheit -32)/9);
		
		System.out.println("Sua temperatura transformada em Celsius: " + celsius);
		
		leia.close();

	}

}
