package principal;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota = 0;
		
		System.out.println("Digite uma nota entre 0 e 10: ");
		nota = leia.nextInt();
		
		while(nota <=0 || nota>= 10){
			
			System.out.println("Valor inválido" );
			
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = leia.nextInt();
		}
		System.out.println("Número válido!");
		leia.close();
	}

}
