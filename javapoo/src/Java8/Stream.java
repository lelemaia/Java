package Java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.Map;
//import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Python", 45));
        cursos.add(new Curso("JavaScript", 150));
        cursos.add(new Curso("Java 8", 113));
        cursos.add(new Curso("C", 55));

        //ordena de acordo com o critério de comparação definido
        cursos.sort(Comparator.comparingInt(Curso::getAlunos));

        //stream= devolve vários métodos para trabalhar a coleção(esses métodos nunca alterarão a coleção original)
        int sum = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)  //filtra (seu critério)
                .mapToInt(Curso::getAlunos)     //depois de aplicado do método(filter), retorna o mapeamento dos elementos da stream(cursos)
                .sum();                        //soma os elementos do mapeamento
        System.out.println(sum);

        
        //devolve a média dos elementos
        OptionalDouble media = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .average();
        System.out.println(media);

        
        //Optional fornece vários métodos para trabalhar com possíveis valores null
        cursos.stream()
                .filter(c -> c.getAlunos() > 100)
                .findAny()    //devolve qualquer elemento
                .ifPresent(c -> System.out.println(c.getNome())); //executa um lambda(um Consumer) no caso de existir 'um curso' dentro do optional


        //obtem uma coleção 'nova' depois de alterar um Stream(conteúdo da coleção)
        cursos.stream()
            .filter(c -> c.getAlunos() > 100)
            .collect(Collectors.toList());


        //mapa que dado o nome do curso, o valor atrelado é a quantidade alunos
        cursos.stream() 
            .filter(c -> c.getAlunos() >= 100) 
            .collect(Collectors.toMap(  
                c -> c.getNome(),                   //a primeira indica o q vai ser a chave
                c -> c.getAlunos()))               //a segunda o q será o valor
            .forEach((nome, alunos) ->  System.out.println(nome + "tem" + alunos + "alunos"));         
    }
}