package principal;

public class Funcoes {

	public static void main(String[] args) {
		/*
		 * Funções representam um processamento ou processo;
		 * O que identifica uma função são os parenteses;
		 * System.out.println() é um exemplo de função/procedimento;
		 * void = vazia
		 * Em orientação ao objeto uma função se chama método;
		 */
		mostrarMensagem();
		mostrarMensagemComParametro(35);
		System.out.println(calcular());
		int recebeCalcular = calcular();
		System.out.println("Recebeu: " + recebeCalcular);
		System.out.println("Resultado:" + soma(5,5));
		
		int x = 10;
		int y = 100;
		
		System.out.println("Nova soma: " + soma(x,y));

		
	}
	
	static void mostrarMensagem() {
		System.out.println("Minha primeira função");
	}
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade é: " + idade);
	}
	static int calcular() {
		int x = 10;
		int y = 5;
		return x + y;
	}
	static int soma(int x, int y) {
		return x + y;
	}
	
	
}
