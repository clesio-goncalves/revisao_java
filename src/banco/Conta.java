package banco;

public class Conta {

	private String titular;
	private int numero;
	private double saldo;
	private static int totalDeContas;
		
	Conta(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
		Conta.totalDeContas++;
	}
	
	public static int getTotalDeContas() {
		return Conta.totalDeContas;
	}

	public void transferirPara(Conta destino, double valor) {
		if (sacar(valor)) { // Se eu conseguir sacar na origem
			destino.depositar(valor); // irei depositar no destino
		}
	}

	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
		}
	}

	public boolean sacar(double valor) {
		if (valor <= this.saldo && valor > 0) {
			this.saldo -= valor;
			return true;
		}

		return false;
	}

	public String getTitular() {
		return titular;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

}
