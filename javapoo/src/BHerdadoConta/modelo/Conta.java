package BHerdadoConta.modelo;

public abstract class Conta extends Object implements Comparable<Conta> {

	private Cliente titular;
	protected double saldo;
	private int agencia;
	private int numero;
	private static int total = 0;

	
	public Cliente getTitular() {
		return titular;
	}
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		if(agencia <= 0){
			System.out.println("Não pode valor negativo");
			return;
		}
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		if(numero <= 0){
			System.out.println("Não pode valor negativo");
			return;
		}
		this.numero = numero;
	}

	public static int getTotal(){
		return Conta.total;
	}

	public Conta(int agencia, int numero){
		Conta.total++ ;
		System.out.println("O total de contas é de: " + Conta.total + " conta(s)");

		this.agencia = agencia;
        this.numero = numero;
        System.out.println("Criando uma conta na agencia: " + this.agencia + ", de numero: " + this.numero);
		System.out.println(" ");
    }


	public void status() {
		System.out.println("Titular: " + this.titular.getNome());
		System.out.println("CPF: " + this.titular.getCpf());
		System.out.println("Profissao: " + this.titular.getProfissao());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Agencia: " + this.getAgencia());
		System.out.println("Numero:  " + this.getNumero());
		System.out.println(" ");
	}

	public abstract void depositar(double valor);

	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			System.out.println("O saque foi realizado");
			return true;
		} else {
			System.out.println("O valor não pode ser sacado");
			return false;
		}
	}

	public boolean transferir(double valor, Conta destino) {
		if (this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		} else{
			return false;
		}
	}

	@Override
	public boolean equals(Object refGen) {  // ref genérica
		Conta outra = (Conta) refGen;   // transformando em referencia especifica
		if(this.agencia != outra.agencia){
			return false;
		}
		if(this.numero != outra.numero){
			return false;
		}
		return true;
	}

	@Override
	public int compareTo(Conta outra) {
		return Double.compare(this.saldo, outra.saldo);
	}

	@Override
    public String toString() {
		return "Numero: " + this.numero + ", Agencia: " + this.agencia + ", Saldo: " + this.saldo;
	    }
	
}
    

