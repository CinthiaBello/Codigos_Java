package principal;

public class Matriz {

	public static void main(String[] args) {
			// Uma matriz é um vetor multidimensional
			// geralmente trabalhamos com 2 dimensões 
			// linha e coluna, parece uma tabela
			
			// os 2 ultimos abre e fecha colchetes são
			// para indicar coluna e linha 
			// no exemplo abaixo temos uma matriz 3x3 
			int [] [] numeros =new int [3] [3]; //linha é o primeiro conchete o segundo conchete é a coluna
	        int contador =10;
	        
	        for (int i = 0; i < numeros.length; i++) { //colunas
	        	for (int j =0; j < numeros.length; j++) { //linhas
	        		numeros [i] [j] = contador;
	        		System.out.print(numeros [i] [j] + "\t");
	        	    contador++;
	        	}
	             System.out.println();     
	        }
	        
	        
	        System.out.print ((numeros [0] [0] =10) + "\t"); // O t é tabulação
	        System.out.print ((numeros [0] [1] =11) + "\t");
	        System.out.print((numeros [0] [2] =12)+ "\t");
	        System.out.println ();
	        System.out.print ((numeros [1] [0] =13) + "\t");
	        System.out.print ((numeros [1] [1] =14)+ "\t");
	        System.out.print((numeros [1] [2] =15) + "\t");
	        System.out.println();
	        System.out.print((numeros [2] [0] =16)+ "\t");
	        System.out.print ((numeros [2] [1] =17)+ "\t");
	        System.out.print ((numeros [2] [2] =18) + "\t");
	        System.out.println();

	}

}
