package principal;

import java.util.Scanner;

public class Sexo {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		char sexo;
		
		System.out.println("Digite o seu sexo (m/f): ");
		sexo = leia.next().charAt(0);
		
		if(Character.toLowerCase(sexo) == 'm') {
			System.out.println("Seu sexo � masculino");
		}else {
			System.out.println("Seu sexo � feminino");
		}
		
		
		leia.close();

	}

}
