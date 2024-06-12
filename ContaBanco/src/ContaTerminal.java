public class ContaTerminal {
    private static int totalContas = 0;
	private int numConta;
	private String agencia;
	private String nomeCliente;
	private float saldo;
	
	ContaTerminal(int numConta, String agencia, String nomeCliente, float saldo) {
		ContaTerminal.totalContas++;
        this.numConta = numConta;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public int getNumConta() {
		return numConta;
	}
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
    public int totalContas(){
        return totalContas;
    }
}