package BancoEncapsulado;

public class Conta {

	private Cliente titular;
	private double saldo;
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
        System.out.println("O total de contas é de: " + Conta.total);
        
		this.agencia = agencia;
        this.numero = numero;
        //this.saldo = 100;
        System.out.println("criando uma conta na agencia: " + this.agencia);
		System.out.println("criando uma conta de numero: " + this.numero);
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

	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}

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
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.depositar(valor);
			return true;
		}
		return false;
	}
}
    

