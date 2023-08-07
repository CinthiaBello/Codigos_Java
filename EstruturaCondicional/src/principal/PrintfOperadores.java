package principal;

import javax.swing.event.SwingPropertyChangeSupport;

public class PrintfOperadores {

	public static void main(String[] args) {
		
		String nome = "Cinthia Bello";
		int idade = 35;
		double altura = 1.77;
		boolean verdadeiro =  true;
		boolean falso =  false;
		
		//para o tipo char usa %c
		System.out.printf("%s, tem %d, e sua altura é: %.2f \n", nome, idade, altura);

		/*  Operadores de comparação
		 * > maior que
		 * < menor que
		 * >= maior ou igual a 
		 * <= menor ou igual a 
		 * != diferente
		 * == igual
		 * 
		 */
		
		/*  Operadores lógicos
		 * && significa E
		 * || significa OU
		 * !  significa NEGAÇÃO
		 * Tabela verdade E / OU
		 * 
		 */
		
		if (verdadeiro || falso) {
			System.out.println(10);
		}else {
			System.out.println(20);
		}
		
		char opcao ='s';
		int idade2 = 18;
		String diaSemana = "Sexta";
		
		
		/*um unico if é uma estrutura simples
		*if e else tenho uma estrutura composta
		*if else é uma estrutura encadeada
		*podemos ter estruturas dentro de cada if / if else
		*/
		if (opcao == 's' && idade2>= 18) {
			System.out.println("Pode entrar na festa");
		}else {
			System.out.println("Volta pra casa");
		}
		// .equals para strings
		// == para os demais
		if (diaSemana.equals ("Segunga")) {
			System.out.println("Segunda-Feira");
		}else if(diaSemana.equals ("Terca")) {
			System.out.println("Terça-Feira");
		}else if (diaSemana.equals ("Sexta")) {
			System.out.println("Sexta-Feira");
		}else {
			System.out.println("Não corresponde a um dia da semana!");
		}
		
		int diasSemana = 2;
		
		switch (diasSemana) {
		case 1:
			System.out.println("Domingo");
			//int novaVariavel = 10;
			break;
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		case 4:
			System.out.println("Quarta");
			break;
		case 5:
			System.out.println("Quinta");
			break;
		case 6:
			System.out.println("Sexta");
			break;
		case 7:
			System.out.println("Sábado");
			break;

		default:
			System.out.println("Não corresponde a um dia da semana");
			break;
		}
		
		
		
		
	}

}
