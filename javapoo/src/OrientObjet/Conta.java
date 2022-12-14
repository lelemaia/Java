package OrientObjet;

public class Conta {

	String titular;
	double saldo;
	int agencia;
	int numero;

	public void status() {
		System.out.println("Titular: " + this.titular);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero:  " + this.numero);
		System.out.println(" ");
	}

	 public void depositar(double valor) {
	        this.saldo = this.saldo + valor;
	    }
	 
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
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