package principal;

public class Media {

	public static void main(String[] args) {
		double nota1 = 4.5;
		double nota2 = 10;
		double nota3 = 6.7;
		double nota4 = 3.3;
		double media = 0;
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.println("Média: " + media);
		
		if (media < 6) {
			System.out.println("Reprovado");
		}
		if (media == 6 && media == 7) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Aprovado");
		}
		
	}

}
