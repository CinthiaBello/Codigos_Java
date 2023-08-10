package principal;

public class Vetor {

	public static void main(String[] args) {
		// vetor ´r uma sequência não ordenada de dados do mesmo tipo
		//a contagem do Vetor é por indece e inicia do indice 0
		//vetor não pode conter dados de tipos diferentes
		//vetor tmb é conhecido como Array
		//Vetor é undimencional, uma direção
		//Os dados do array são armazenados em um espaço de memoria
		
		//Principal desvantagem é tamanho fixo.
		
		//  (xpto123) = 10, 20, 30, 40

		int [] numeros = new int[5];
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		
		System.out.println("Fora do for: " + numeros[0]);
		
		for(int contador = 0;contador < 5; contador++) {
			System.out.println("Dentro do for: " + numeros[contador]);
		}
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}

}
