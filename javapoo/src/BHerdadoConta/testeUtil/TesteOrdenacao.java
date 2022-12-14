package BHerdadoConta.testeUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import BHerdadoConta.modelo.Cliente;
import BHerdadoConta.modelo.Conta;
import BHerdadoConta.modelo.ContaCorrente;
import BHerdadoConta.modelo.ContaPoupanca;

public class TesteOrdenacao {
    public static void main(String[] args) {

        // criacao das contas e clientes
        Conta cc1 = new ContaCorrente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNome("Nico");
        cc1.setTitular(clienteCC1);
        cc1.depositar(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNome("Guilherme");
        cc2.setTitular(clienteCC2);
        cc2.depositar(444.0);


        Conta cc3 = new ContaCorrente(22, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNome("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.depositar(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNome("Ana");
        cc4.setTitular(clienteCC4);
        cc4.depositar(222.0);

        // criando a lista e adicionando as contas
        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        // lista antes da ordenacao
        for (Conta contasDesordenadas : lista) {
            System.out.println(contasDesordenadas);
        }

        // criando uma instancia(tipo) da classe OrdemNumContas)
       // OrdemNumContas comparador1 = new OrdemNumContas(); --- antigo
        OrdemTitularConta comparador2 = new OrdemTitularConta();
        lista.sort(comparador2);  //sort precisa ser implementado para definir o critério de ordenacao (método definido)

        //Collections.sort(lista);
        //Collections.reverse(lista);

        System.out.println(" ");
        // lista depois da ordenacao
        for (Conta ContasOrdenadas : lista) {
            System.out.println(ContasOrdenadas +"," +ContasOrdenadas.getTitular().getNome());
        }
    }
}

// nova classe implementa Comparator que compara <Contas>
class OrdemNumContas implements Comparator<Conta> {

    @Override   // método comparador
    public int compare(Conta c1, Conta c2) { // vai comparar o tipo Conta conta especifica(c1), ...
        return Integer.compare(c1.getNumero(), c2.getNumero());
    }
}

class OrdemTitularConta implements Comparator<Conta> {

    @Override  // método comparador 
    public int compare(Conta c1, Conta c2) {
        String nomeC1 = c1.getTitular().getNome();
        String nomeC2 = c2.getTitular().getNome();
        return nomeC1.compareTo(nomeC2); //(ordem alfabetica)
    }
}