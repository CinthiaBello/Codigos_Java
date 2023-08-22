package principal;

import java.util.Scanner;

import entities.Usuario;

public class ProgramUsuario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Usuario usuario = new Usuario();
		
		System.out.println("Digite seu nome: ");
		usuario.setNome(leia.nextLine());
		System.out.println("Digite seu e-mail: ");
		usuario.setEmail(leia.nextLine());
		System.out.println("Digite sua senha: ");
		usuario.setSenha(leia.nextLine());
		
		leia.close();

	}

}
