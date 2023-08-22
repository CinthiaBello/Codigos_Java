package entities;
//3) crie um programa que receba o nome, o e-mail e a senha do usuário, o usuário só poderá alterar a senha através 
// de um método e a senha não pode ser mostrada na tela principal do programa;

public class Usuario {
	private String nome;
	private String email;
	private String senha;
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void recebeDados() {
		System.out.println("Nome: " + nome);
		System.out.println("E-mail: " + email);
		//System.out.println("Senha: " + senha); teste
	}
	public void alterarSenha() {
		
	}

}
