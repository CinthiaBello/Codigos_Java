package principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		/* Listas trabalham com dados do mesmo tipo
		 * Uma lista é um tipo genérico de uma collection
		 * Uma lista é uma coleção de dados
		 */
		
		ArrayList<String> nomes = new ArrayList<>();
		
		String nome1 = "Adicionado por último";
		
		nomes.add("Cinthia");
		nomes.add("Julia");
		nomes.add("Maria");
		nomes.add("José");
		nomes.add(nome1);
		
		System.out.println(nomes);

		System.out.println(nomes.get(4));
		
		nomes.remove(1);
		
		System.out.println(nomes);
		
		System.out.println("Imprimindo com forEach:");
		for (String nome : nomes) {
			System.out.println(nome);
		}
		
		System.out.println("Imprimindo com for: ");
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		
		System.out.println("Imprimindo com expressão lambda: ");
		//pesquisam sobre expressão
		nomes.forEach(nome ->System.out.println(nome));
		
		System.out.println("Imprimindo ordenadamente: ");
		Collections.sort(nomes);
		
		nomes.forEach(nome -> System.out.println(nomes));
	}
	

}
