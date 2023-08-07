package principal;

public class MaiorNumero {

	public static void main(String[] args) {
		
		int numero1 = 5;
		int numero2 = 10;
		int numero3 = 123;
		
		if(numero1 > numero2 && numero1 > numero3){
			System.out.println("O maior é: " + numero1);
        }
        if(numero2 > numero3 && numero2 > numero1){
        	System.out.println("O maior é: " + numero2);
        }
        if(numero3 > numero1 && numero3 > numero2){
        	System.out.println("O maior é: " + numero3);
        }
       
			

	}

}
