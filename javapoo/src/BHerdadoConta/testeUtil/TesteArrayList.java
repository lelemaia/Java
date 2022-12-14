package BHerdadoConta.testeUtil;

import java.util.ArrayList;
import BHerdadoConta.modelo.Conta;
import BHerdadoConta.modelo.ContaCorrente;

public class TesteArrayList {
    public static void main(String[] args) {

        // Generics = <>
        ArrayList<Conta> lista = new ArrayList<Conta>();

        Conta cc = new ContaCorrente(11, 111);
        lista.add(cc); // add- adiciona o elemento ao Array
        Conta cc2 = new ContaCorrente(22, 222);
        lista.add(cc2);
        Conta cc3 = new ContaCorrente(33, 333);
        lista.add(cc3);
        Conta cc4 = new ContaCorrente(44, 444);
        lista.add(cc4);

        System.out.println(lista.size()); // size- mostra o tamanho do Array(quantas referencias foram guardadas)

        Conta ref = (Conta) lista.get(0); // get- mostra o indice da lista
        System.out.println(ref.getNumero()); // vai mostrar o numero da conta cc pois ela está no index 0

        lista.remove(0); // como remover um elemento
        System.out.println("Tamanho atual: " + lista.size()); // mostrando o tamanho atual com o 'remove'

        for (int i = 0; i < lista.size(); i++) {
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-------");

        for (Object o : lista) {
         System.out.println(o);
        }
    }
}
