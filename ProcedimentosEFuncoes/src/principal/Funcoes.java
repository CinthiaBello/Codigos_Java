package principal;

public class Funcoes {

	public static void main(String[] args) {
		/*
		 * Fun��es representam um processamento ou processo;
		 * O que identifica uma fun��o s�o os parenteses;
		 * System.out.println() � um exemplo de fun��o/procedimento;
		 * void = vazia
		 * Em orienta��o ao objeto uma fun��o se chama m�todo;
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
		System.out.println("Minha primeira fun��o");
	}
	static void mostrarMensagemComParametro(int idade) {
		System.out.println("Minha idade �: " + idade);
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
