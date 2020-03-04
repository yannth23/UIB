
public class app {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "Yann Thor";
		cliente.CPF = "123";
		
		Conta conta = new Conta();
		conta.numeroConta = 123-1;
		conta.saldoConta = 100;
		conta.cliente = cliente;
		
		System.out.println(conta.cliente.nome);
		
		
	}

}
