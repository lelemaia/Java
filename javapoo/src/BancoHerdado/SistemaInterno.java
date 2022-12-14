package BancoHerdado;

public class SistemaInterno {

    private int senha = 2222;


    public void autenticar(Autenticavel g) {
        boolean autenticou = g.autenticar(this.senha);
        if (autenticou) {
            System.out.println("pode entrar no sistema");
        } else {
            System.out.println("nao pode entrar no sitema");
        }
    }
    

}
