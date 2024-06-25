package bancoDigital;

import java.util.ArrayList;
import java.util.List;

public class BancoDigital {

	private List<Conta> contas;
	
	public BancoDigital() {
		this.contas = new ArrayList<>();
	}
	
	private void novaConta(Conta conta) {
		this.contas.add(conta);
		if (conta instanceof ContaCorrente)
			System.out.println(String.format("Conta Corrente Criada, Agencia: %d, Conta: %d", conta.getAgencia(), conta.getNumero()));
		else 
			System.out.println(String.format("Conta Poupanca Criada, Agencia: %d, Conta: %d", conta.getAgencia(), conta.getNumero()));
	}
	
	public void novaContaPoupanca() {
		Conta conta = new ContaPoupanca();
		novaConta(conta);
	}
	
	public void novaContaCorrente() {
		Conta conta = new ContaCorrente();
		novaConta(conta);
	}
}
