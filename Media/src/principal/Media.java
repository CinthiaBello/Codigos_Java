package principal;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		
		System.out.println("Digite a primeira nota");
		nota1 = leia.nextDouble();
		System.out.println("Digite a segunda nota");
		nota2 = leia.nextDouble();
		System.out.println("Digite a terceira nota");
		nota3 = leia.nextDouble();
		System.out.println("Digite a quarta nota");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Média: " + media);
		
		if (media < 6) {
			System.out.println("Reprovado" + media);
		}
		else if (media >= 6 && media < 7) {
			System.out.println("Recuperação" + media);
		}else if(media >= 7 && media < 10){
			System.out.println("Aprovado" + media);
		}else {
			System.out.println("Aprovado com honra" + media);
			
		}
		
	}

}
