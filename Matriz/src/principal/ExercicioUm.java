package principal;

public class ExercicioUm {

	public static void main(String[] args) {
		// fazer uma matriz 3x3 ou 4x4, imprimir os numeros da diagonal dessa matriz;
		int [] [] numeros =new int [3] [3];
		int contador = 10;
		
		for (int i = 0; i < numeros.length; i++) { 
        	for (int j =0; j < numeros.length; j++) {
        		if (i==j) {
        			numeros [i] [j] = contador;
            		System.out.print(numeros [i] [j] + "\t");
        		}
        		contador ++;
        	}
        	System.out.println();
		}
		/*System.out.print ((numeros [0] [0] =10) + "\t"); 
        System.out.print ((numeros [0] [1] =0) + "\t");
        System.out.print((numeros [0] [2] =0)+ "\t");
        System.out.println ();
        System.out.print ((numeros [1] [0] =0) + "\t");
        System.out.print ((numeros [1] [1] = 14)+ "\t");
        System.out.print((numeros [1] [2] =0) + "\t");
        System.out.println();
        System.out.print((numeros [2] [0] =0)+ "\t");
        System.out.print ((numeros [2] [1] =0)+ "\t");
        System.out.print ((numeros [2] [2] = 18) + "\t");
        System.out.println();*/

	}

}
