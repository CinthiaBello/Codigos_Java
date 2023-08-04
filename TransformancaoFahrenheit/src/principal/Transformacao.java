package principal;

import java.util.Scanner;

public class Transformacao {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double celsius = 0;
		double fahrenheit = 0;
		
		System.out.println("Digite sua temperatura em Celsius: ");
		celsius = leia.nextDouble();
		
		fahrenheit = (celsius * 1.8) + 32;
				
		System.out.println("Sua temperatura transformada em Fahrenheit: " + fahrenheit);	
		

	}

}
