package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.print("Digite seu nome: ");
		nome = leia.nextLine();
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		System.out.print("Digite sua altura: ");
		altura = leia.nextDouble();
		System.out.print("Digite seu sexo (M/F): ");
		sexo = leia.next().charAt(0);
		
		System.out.println("\n Seus Dados pessoais: \n");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Altura: " + altura);
		System.out.println("Sexo: " + sexo);
		
		leia.close();

	}

}
