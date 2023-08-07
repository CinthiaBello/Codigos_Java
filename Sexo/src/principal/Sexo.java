package principal;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char sexo = 0;
		
		System.out.println("Digite o seu sexo: ");
		sexo = leia.next().charAt(0);
		
		System.out.println("Seu sexo é: " + sexo);
		
		leia.close();

	}

}
