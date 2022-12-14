package BHerdadoConta.teste;

import BHerdadoConta.modelo.CalculadorDeImposto;
import BHerdadoConta.modelo.ContaCorrente;
import BHerdadoConta.modelo.SeguroDeVida;

public class TestesTributaveis {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.depositar(100.0);
        SeguroDeVida seguro = new SeguroDeVida();
        CalculadorDeImposto calc = new CalculadorDeImposto();
        calc.registra(cc);
        calc.registra(seguro);
        System.out.print("valor dos impostos: " + calc.getTotalImposto());
        System.out.println(" ");

        ContaCorrente c2 = new ContaCorrente(111, 111);
        c2.depositar(200.0);
        SeguroDeVida seg2 = new SeguroDeVida();
        CalculadorDeImposto calc2 = new CalculadorDeImposto();
        calc2.registra(c2);
        calc2.registra(seg2);
        System.out.print("valor dos impostos: " + calc2.getTotalImposto());
        System.out.println(" ");

        
        ContaCorrente c3 = new ContaCorrente(777, 777);
        c3.depositar(300.0);
        SeguroDeVida seg3 = new SeguroDeVida();
        CalculadorDeImposto calc3 = new CalculadorDeImposto();
        calc3.registra(c3);
        calc3.registra(seg3);
        System.out.print("valor dos impostos: " + calc3.getTotalImposto());
    }
}
