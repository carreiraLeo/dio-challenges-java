package bancoDigital;

public interface IntConta {
	boolean depositar(double valor);
	boolean sacar(double valor);
	boolean transferir(double valor, Conta destino);
}
