package BancoHerdado;

public class ControleBonificacao {

    private double soma;

    public void registra(Funcionario f1) {
        double boni = f1.getBonificacao();  // realiza o método getbonificacao para o objt que chama método '.registra'
        System.out.println("a bonificao é de: "+ boni);
        this.soma = this.soma + boni;  // realiza a soma das bonificaoes
    }

    public double getSoma() {
        return soma;
    }
}
