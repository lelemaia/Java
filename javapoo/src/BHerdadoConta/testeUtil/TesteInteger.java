package BHerdadoConta.testeUtil;

import java.util.ArrayList;
import java.util.List;

public class TesteInteger {
    public static void main(String[] args) {

        // int idade = 29;
        Integer idadeRef = Integer.valueOf(29);    // autoboxing = de primitivo para referencia
        System.out.println(idadeRef.doubleValue());  // transforma o int em double
        int valor = idadeRef.intValue();            // unboxing=  de referencia para primitivo
        System.out.println(valor);

        System.out.println(" ");
        System.out.println(Integer.MAX_VALUE);    // mostra o valor max que o integer pode guardar
        System.out.println(Integer.MIN_VALUE);   // valor min
        System.out.println(Integer.SIZE);       // mostra o tamanho do integer
        System.out.println(Integer.BYTES);     // mostra os bytes

        String s = args[0];  // "10"
        //Integer numero = Integer.valueOf(s);   // modo 'braçal'
        int numero = Integer.parseInt(s);       // tranforma para um tipo especifico (precisa configurar por isso nao vai rodar)
        System.out.println(numero);

        List<Integer> numeros = new ArrayList<Integer>();
        numeros.add(29);    // Autoboxing automatico

    }
}