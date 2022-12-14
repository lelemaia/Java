package BHerdadoConta.teste;

// imutabilidade
public class TesteString {

    public static void main(String[] args) {

        String nome = "Alura";

        String outra = nome.replace('A','a');

        //String outra = nome.toLowerCase();

        System.out.println(nome);
        System.out.println(outra);
        
    }
}
