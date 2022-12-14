package OrientObjet;

public class Contas {
	public static void main(String[] args) {

		Conta primeiraConta = new Conta();
		primeiraConta.titular = "josé";
		primeiraConta.saldo = 200;
		// primeiraConta.depositar(50);
		// primeiraConta.sacar(12);
		primeiraConta.agencia = 01;
		primeiraConta.numero = 111;
		primeiraConta.status();

		Conta segundaConta = new Conta();
		segundaConta.titular = "ana";
		segundaConta.saldo = 33300;
		//segundaConta.transferir(300, primeiraConta); ERRO
		segundaConta.agencia = 02;
		segundaConta.numero = 222;
		segundaConta.status();

	boolean sucessoTransferencia = segundaConta.transferir(300, primeiraConta);
	if (sucessoTransferencia) {
		System.out.println("transferencia feita com sucesso");
	} else {
		System.out.println("faltou dinheiro");
	}
	System.out.println(" ");

		System.out.println("Saldo atual: "+ segundaConta.saldo);
		System.out.println("Saldo atual: "+ primeiraConta.saldo);

	
//		DEU CERTO
//		if (primeiraConta == segundaConta) {
//			System.out.println("As contas são iguais");
//		} else {
//			System.out.println("As contas são diferentes");
//		}

		
	}
}
