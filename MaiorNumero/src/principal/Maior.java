package principal;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		 int numero1 = 0;
		 int numero2 = 0;
		 
		 System.out.println("Digite o primeiro número: ");
		 numero1 = leia.nextInt();
		 System.out.println("Digite o segundo número: ");
		 numero2 = leia.nextInt();
		 
		 System.out.println("Maior número é: " + Math.max(numero1, numero2));
		 
		 leia.close();
		 

	}

}
