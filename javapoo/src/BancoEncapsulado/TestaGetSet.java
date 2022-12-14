package BancoEncapsulado;

public class TestaGetSet {
  
    public static void main(String[] args) {

        Conta conta = new Conta(1337, 24226);
        System.out.println(conta.getAgencia());      // mostrar agencia
        System.out.println(conta.getNumero());       // mostrar numero
 
        Cliente ana = new Cliente();
        ana.setNome("ana");                           // setar o nome do cliente
        conta.setTitular(ana);                             // ligar nome do cliente a conta
        System.out.println(conta.getTitular());            // mostrar titular
        System.out.println(conta.getTitular().getNome());  // mostrar nome
    }
}

    

