package principal;

import java.util.Scanner;

public class DoisNumerosInteiros {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Digite o primeiro número: ");
		num1 = leia.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = leia.nextInt();
		
		while(num2 < num1) {
			System.out.println("Segundo número tem que ser maior");
			num2 =  leia.nextInt();
		}
		for(int contador = ++num1; contador < num2; contador++){
			System.out.println(contador);
			
		}
		
		leia.close();

	}

}
