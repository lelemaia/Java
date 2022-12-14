package BancoHerdado;

public class TesteGerente {
  public static void main(String[] args) {

    // Autenticavel referencia = new Cliente();

    Gerente g1 = new Gerente();
    g1.setNome("Marco");
    g1.setCpf("123456");
    g1.setSalario(5000.00);

    System.out.println(" ");
    System.out.println(g1.getNome());
    System.out.println(g1.getCpf());
    System.out.println(g1.getSalario());

    g1.setSenha(222);
    boolean autenticou = g1.autenticar(222);
    System.out.println("true = autenticado, false = não autenticado: " + autenticou);

    System.out.println(g1.getBonificacao());

  }

}
