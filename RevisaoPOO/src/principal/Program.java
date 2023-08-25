package principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Funcionario func = new Funcionario();
		
		pessoa.setNome("Cinthia");
		pessoa.setAltura(1.77);
		pessoa.setCpf("123.456.789-10");
		pessoa.setGenero("Feminino");
		pessoa.setIdade(35);
		
		System.out.println(pessoa);

		func.setNome("Cinthia");
		func.setAltura(1.77);
		func.setCpf("123.456.789-10");
		func.setGenero("Feminino");
		func.setIdade(35);
		func.setSalario(2548.89);
		func.setEmpresa("SESI - SENAI");
		
		System.out.println(func);
	}

}
