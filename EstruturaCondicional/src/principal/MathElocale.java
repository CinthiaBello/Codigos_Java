package principal;

import java.util.Locale;
import java.util.Scanner;

public class MathElocale {

	public static void main(String[] args) {
		//atalho para importar ctrl+shift+o
		final Locale ponto = new Locale ("en", "us");
		Scanner leia = new Scanner(System.in);
		
		
		double altura = 0;
		double decimal = 0;
		
		
		System.out.println("Entre com sua altura: ");
		altura = leia.useLocale(ponto).nextDouble();
		
		System.out.println("A altura digitada foi: " + altura);
		
		//Pot�cia
		System.out.println(Math.pow(2, 5));
		
		//Maior n�mero entre 2 n�meros ou vari�veis
		System.out.println(Math.max(2, 10));
		
		//Menor n�mero entre 2 n�meros ou vari�veis
		System.out.println(Math.min(2, 10));
		
		//obter rais quadrada
		System.out.println(Math.sqrt(16));
		
		//arredondador n�meros
		System.out.println(Math.round(decimal));
		
		//numero PI armazenamento
		System.out.println(Math.PI);
		
		leia.close();

	}

}
//printf para casas decimais --> %.2f, para mostrar apenas 2 casas decimais.
