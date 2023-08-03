package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Digite seu nome: ");
		//leitura de dados tipo String(conjunto de caracteres)
		nome = leia.nextLine();
		System.out.println("Digite sua idade: ");
		//leitura de dados tipo inteiro
		idade = leia.nextInt();
		System.out.println("Digite sua altura:");
		//leitura de dados tipo decimal
		altura = leia.nextDouble();
		//leitura de dados tipo char(caracter)
		System.out.println("Qual seu sexo (m/f): ");
		sexo = leia.next().charAt(0);
		
		//Para pular uma linha \n
		System.out.println("\nO nome digitado foi: " + nome);
		System.out.println("Sua idade é " + idade);
		System.out.println("Sua altura é " + altura);
		System.out.println("Seu sexo é: " + sexo);
		
		leia.close();

	}

}
