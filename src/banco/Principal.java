package banco;

public class Principal {

	public static void main(String[] args) {

		Conta origem = new Conta("Clésio", 123);
		Conta destino = new Conta("Marcio", 456);
		Conta gabriel = new Conta("Gabriel", 345);

		origem.depositar(100);
		origem.transferirPara(destino, 30);

		System.out.println("Saldo de origem: " + origem.getSaldo());
		System.out.println("Saldo de destino: " + destino.getSaldo());
		System.out.println("Total de Contas: " + Conta.getTotalDeContas());

	}

}
