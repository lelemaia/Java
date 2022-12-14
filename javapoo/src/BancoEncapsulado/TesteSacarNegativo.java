package BancoEncapsulado;

public class TesteSacarNegativo {


        public static void main(String[] args) {

            Conta suaConta = new Conta(13, 13);
            suaConta.depositar(10);

            System.out.println(suaConta.sacar(200)); 
            System.out.println(suaConta.getSaldo());
        }
}

