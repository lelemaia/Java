package BHerdadoConta.teste;

import BHerdadoConta.modelo.ContaCorrente;
import BHerdadoConta.modelo.ContaPoupanca;

public class TesteContas {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(11, 11);
        cc.depositar(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.depositar(200);

        cc.transferir(10, cp);

        System.out.println(" ");
        System.out.println("CC: "+ cc.getSaldo());
        System.out.println("CP: "+cp.getSaldo());


    }

}
