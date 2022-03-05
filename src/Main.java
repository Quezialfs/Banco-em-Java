
public class Main {

	public static void main(String[] args) {
		Cliente quezia = new Cliente();
		quezia.setNome("quezia");
		
		Conta cc = new ContaCorrente(quezia);			
		Conta poupanca = new ContaPoupanca(quezia);
		
		cc.transferir(100, poupanca);
		cc.depositar(100);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
