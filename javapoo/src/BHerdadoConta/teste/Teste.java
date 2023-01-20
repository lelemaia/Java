package BHerdadoConta.teste;

import BHerdadoConta.modelo.Conta;
import BHerdadoConta.modelo.ContaCorrente;
import BHerdadoConta.modelo.GuardadorDeContas;

public class Teste {
    public static void main(String[] args) {

        GuardadorDeContas g = new GuardadorDeContas(); // criou novo array

        Conta cc1 = new ContaCorrente(11, 11);
        g.adiciona(cc1);
        Conta cc2 = new ContaCorrente(222, 222);
        g.adiciona(cc2);

        int tamanho = g.getTamanho();
        System.out.println(tamanho);

        // exemplo aleatorio
        Conta exemplo = g.getPosicao(1); // como a posicao informada é "g.getPosicao(posição: 1)" 
        System.out.println(exemplo.getNumero()); //  ele vai chamar o numero da cc2
    }
}
