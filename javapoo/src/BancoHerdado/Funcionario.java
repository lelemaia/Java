package BancoHerdado;

// nao pode instanciar dessa classe (funcionario) PQ É ABSTRATO (precisa colocar gerente,desingner...)
public abstract class Funcionario {

    private String nome;
    private String cpf;
    private double salario;


// método sem corpo, nao ha implementacao (aqui, mas nas classes filhas tem)
    public abstract double getBonificacao();
        

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

}
