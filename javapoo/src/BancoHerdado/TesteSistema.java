package BancoHerdado;

public class TesteSistema {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setSenha(2222);

        Administrador adm = new Administrador();
        adm.setSenha(2222);

        Cliente cl = new Cliente();
        cl.setSenha(4444);

        SistemaInterno si = new SistemaInterno();
        System.out.println(" ");
        si.autenticar(g);
        si.autenticar(adm);
        si.autenticar(cl);

    }

}
