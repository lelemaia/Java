package BancoEncapsulado;

public class TestaBancos {

	public static void main(String[] args) {
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo Vieira");
		paulo.setCpf(12356789);
		paulo.setProfissao("namorado"); 
		
		Conta contaDoPaulo = new Conta(1111, 1);
		contaDoPaulo.depositar(100);
		contaDoPaulo.setTitular(paulo);     // para ligar o cliente a conta
		contaDoPaulo.status();
		
		
		//OUTRO MODO DE FAZER  
		// QUE ESTAVA CERTO ANTES DE PRIVAR OS MÉTODOS

		//Conta contaDaMarcela = new Conta(44, 44);
		//contaDaMarcela.depositar(300);
		//contaDaMarcela.setTitular("Marcela");
		//contaDaMarcela.setNome("Marcela");
		//contaDaMarcela.setTitular.cpf = 987654321;
		//contaDaMarcela.setTitular.profissao = "estudante";
		//contaDaMarcela.status();
	}

}
    