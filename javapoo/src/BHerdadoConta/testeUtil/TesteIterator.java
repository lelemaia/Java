package BHerdadoConta.testeUtil;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TesteIterator {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        nomes.add("Super Mario");
        nomes.add("Yoshi");
        nomes.add("Donkey Kong");

        Iterator<String> coisa = nomes.iterator();
        while (coisa.hasNext()) {  // enquanto tiver um proximo ele mostra a lista
            System.out.println(coisa.next());
        }

        System.out.println(" ");

        Set<String> nomes2 = new HashSet<>();
        nomes2.add("Super ");
        nomes2.add("Y");
        nomes2.add("Donkey ");

        Iterator<String> it = nomes2.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}