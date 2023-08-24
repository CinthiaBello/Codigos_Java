package principal;
/*Faça um programa que receba o nome de 5 pessoas e imprima na ordem alfabética (usar o Scanner, não precisa de classe)
 * 
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> nomes = new ArrayList<>();
				
		
		System.out.println("Digite o primeiro nome: ");
		nomes.add(leia.nextLine());
		System.out.println("Digite o segundo nome: ");
		nomes.add(leia.nextLine());
		System.out.println("Digite o terceiro nome: ");
		nomes.add(leia.nextLine());
		System.out.println("Digite o quarto nome: ");
		nomes.add(leia.nextLine());
		System.out.println("Digite o quinto nome: ");
		nomes.add(leia.nextLine());
		
		System.out.println(nomes);
		
		System.out.println("Imprimindo ordenadamente: ");
		Collections.sort(nomes, String.CASE_INSENSITIVE_ORDER);
		
		System.out.println(nomes);
		
		leia.close();

	}

}
