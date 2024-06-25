package bancoDigital;

public abstract class Conta implements IntConta {

	private static int totalContas = 1;

	private int agencia;
	private int numero;
	private double saldo;

	public Conta() {
		this.agencia = 1;
		this.numero = Conta.totalContas++;
		this.saldo = numero;
	}

	@Override
	public boolean depositar(double valor) {
		if (valor > 0D) {
			saldo += valor;
			return true;
		}
		return false;
	}

	@Override
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	@Override
	public boolean transferir(double valor, Conta destino) {
		if (sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		return false;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
