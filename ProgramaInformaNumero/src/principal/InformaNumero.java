package principal;

import java.util.Scanner;

public class InformaNumero {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double numero;
		
		
		System.out.println("Digite um número: ");
		numero = leia.nextDouble();
		
		System.out.println("O número digitado foi: " + numero);
		
		leia.close();
		

	}

}
