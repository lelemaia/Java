package BHerdadoConta.testeUtil;

import java.util.ArrayList;
import BHerdadoConta.modelo.Conta;
import BHerdadoConta.modelo.ContaCorrente;

public class TesteArrayListEquals {
    public static void main(String[] args) {

        // Generics = <>
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc1 = new ContaCorrente(11, 111);
        lista.add(cc1); // add- adiciona o elemento ao Array
        Conta cc2 = new ContaCorrente(22, 222);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(22, 222);
       // lista.add(cc3);

        boolean existe = lista.contains(cc3);  // contains- verifica se a referencia existe dentro do Array
        System.out.println("Já existe? " + existe);


        for (Conta contas : lista) {
            System.out.println(contas);
        }
    }
}
