package principal;

import java.util.Scanner;

public class Ano {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int ano = 0;
		
		System.out.println("Digite um ano: ");
		ano = leia.nextInt();
		
		if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) { 
		    System.out.println("� um ano Bissexto!"); 
		} else {
			System.out.println("N�o � um ano Bissexto!"); 
		    } 
		
		
		leia.close();

	}

}
