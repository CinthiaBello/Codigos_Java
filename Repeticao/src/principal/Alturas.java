package principal;

import java.util.Scanner;

public class Alturas {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double media = 0;
		double alt = 0;
		
		
		for(int contador = 1; contador <=10; contador++ ) {
			System.out.println("Digite sua altura:");
			alt = leia.nextDouble();
			media = media + alt;
			// OU media += alt;
		}
		media = media/10;
		System.out.println("M�dia: " + media);
		leia.close();

	}

}
