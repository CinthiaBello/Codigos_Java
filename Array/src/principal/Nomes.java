package principal;

import java.util.Scanner;

public class Nomes {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		int qntdade = 0;
		System.out.println("Digite a quantidade de nomes: ");
		qntdade = leia.nextInt();
		
		String [] nomes = new String[qntdade];

		
		for(int contador = 0; contador < qntdade; contador++ ) {
			System.out.println("Digite o nome: ");
			nomes[contador] = leia.next();
		}
		System.out.println("Lista de nomes:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		leia.close();
		

	}

}