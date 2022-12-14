package BHerdadoConta.teste;

import BHerdadoConta.modelo.Conta;
import BHerdadoConta.modelo.ContaCorrente;
import BHerdadoConta.modelo.ContaPoupanca;

public class TesteArrayRef {
    public static void main(String[] args) {

        Object[] referencias = new Object[5];

        ContaCorrente cc1 = new ContaCorrente(222, 111);
        referencias[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(22, 22);
        referencias[1] = cc2;
        System.out.println(cc2.getNumero());   // jeitos de chamar iguais
        
       // System.out.println(conta[1].getNumero());     errado usar para classe object,ela nao tem getNumero

        Conta ref = (ContaPoupanca)referencias[1];
        System.out.println(ref.getNumero()); // jeito de chamar c array de referencia
    }

}
