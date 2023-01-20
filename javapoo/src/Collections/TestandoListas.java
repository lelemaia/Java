package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe Aula";
		String aula3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		for (String aula : aulas) {
			System.out.println("Aula: " + aula);
		}
		System.out.println(" ");

		// removeu o 1 item da lista
		aulas.remove(0);
		System.out.println("Removido: " + aulas);
		System.out.println(" ");

		// pega a posição do item na lista
		String primeiraAula = aulas.get(0);
		System.out.println("Item na posição informada: " + primeiraAula);
		System.out.println(" ");

		// percorrendo a lista por indice
		for (int i = 0; i < aulas.size(); i++) {
			System.out.println("Indice Aula: " + aulas.get(i));
		}
		System.out.println(" ");

		// quantidade de itens na lista
		System.out.println("quantidade de itens na lista: " + aulas.size());
		System.out.println(" ");

		// lambda "para cada elemento na coleção: faz tal coisa"
		aulas.forEach(aula -> {
			System.out.println("Lambda Percorrendo: ");
			System.out.println("Aula " + aula);
		});
		System.out.println(" ");

		// adicionando um novo item a lista
		aulas.add("Aumentando nosso conhecimento");
		System.out.println("Item adicionado: " + aulas);
		System.out.println(" ");

		// ordenando a lista
		Collections.sort(aulas);
		System.out.println("Depois de ordenado:" + aulas);

	}
}