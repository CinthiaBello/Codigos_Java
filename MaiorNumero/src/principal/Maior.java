package principal;

import java.util.Scanner;

public class Maior {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		 int numero1 = 0;
		 int numero2 = 0;
		 
		 System.out.println("Digite o primeiro n�mero: ");
		 numero1 = leia.nextInt();
		 System.out.println("Digite o segundo n�mero: ");
		 numero2 = leia.nextInt();
		 
		 System.out.println("Maior n�mero �: " + Math.max(numero1, numero2));
		 
		 leia.close();
		 

	}

}
