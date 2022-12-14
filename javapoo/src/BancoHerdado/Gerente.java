package BancoHerdado;

// Gerente é um funcionário e assina o 'contrato' Autenticavel
public class Gerente extends Funcionario implements Autenticavel {

    private AutenticacaoUtil autenticador;

    public Gerente() {
        this.autenticador = new AutenticacaoUtil();
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    } 

    @Override
    public boolean autenticar(int senha) {
        return this.autenticador.autenticar(senha);
    }

    public double getBonificacao() {
        System.out.println("bonificacao do GERENTE");
        return super.getSalario() * 2;
    }
}