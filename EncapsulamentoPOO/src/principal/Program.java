package principal;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome ("Cinthia");
		pessoa.setAno(1987);
		
		pessoa.calculaIdade();
		

	}

}
