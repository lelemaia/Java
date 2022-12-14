package BHerdadoConta.teste;

public class TesteArrayPrimitivos {  
    public static void main(String[] args) {   // Array []
        
        int[] idades = new int[5]; // inicializa o array com os valores padroes

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
            System.out.println(idades[i]);
        }
    }
}
