package principal;
import java.util.Scanner;

public class ExercicioDois{
	public static void main(String [] args){
		//fazer uma matriz 4 x 4 para inserir nome e as 4 notas 
		//do aluno, não precisa 
		//mostrar a media. imprima o nome e as notas
		
		Scanner leia = new Scanner (System.in);

 
		String [] [] notas =new String [4] [5];
		String nome = "";
  
		for (int i = 0; i < notas.length; i++ ) {
			for(int j = 0; j < notas[i].length; j++){
				if(j == 0) {
				System.out.print("Digite nome: ");
				notas[i][j] = leia.next();
				}else {
					System.out.println("Digite a nota: ");
					notas[i][j] = leia.next();
				}
			}
  	
		}
		for (int i = 0; i < notas.length; i++ ) {
			for (int j = 0; j < notas[i].length; j++){
				System.out.print(notas [i][j] + "\t");
			}
			System.out.println();
		}
		leia.close();
  
	
	}
}
