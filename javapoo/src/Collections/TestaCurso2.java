package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));
		System.out.println("Curso:");
		System.out.println(javaColecoes);
		System.out.println(" ");

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println("Lista de aulas:");
		System.out.println(aulasImutaveis);
		System.out.println(" ");

		//criou uma nova lista com os itens da outra(aulasImutaveis)
		List<Aula> aulasOrdemAlfabetica = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulasOrdemAlfabetica);
		System.out.println("Lista Ordenada:");
		System.out.println(aulasOrdemAlfabetica);
		System.out.println(" ");
		
		//pega o método q calcula o tempo do curso
		System.out.println("Tempo do curso:");
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(" ");
	}
}