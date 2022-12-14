package BHerdadoConta.teste;

import BHerdadoConta.modelo.ContaCorrente;
import BHerdadoConta.modelo.ContaPoupanca;

public class TesteObject {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(22, 3333);
        ContaPoupanca cp = new ContaPoupanca(33, 222);

        System.out.println(" ");
        System.out.println(cc);
        System.out.println(cp);
    }

    
    static void println(Object conta) {
    }
}
