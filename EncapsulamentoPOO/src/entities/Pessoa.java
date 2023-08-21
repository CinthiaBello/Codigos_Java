package entities;

public class Pessoa {
	private String nome;
	private int idade;
	private int ano;

	
	public void calculaIdade() {
		idade = 2023 - ano;
		System.out.println(nome + " tem, " + idade + " anos.");
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getAno() {
		return ano;
	}


	public void setAno(int ano) {
		this.ano = ano;
	}

}
