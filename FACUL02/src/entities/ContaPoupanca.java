package entities;

public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(int numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
		
	}

	@Override
	public double sacar(double valor) {
		
		if(valor > 0 && valor <= getSaldo()) {
			setSaldo(getSaldo() - valor);
			return getSaldo();
		} else {
			System.out.println("Saque negado! Saldo insuficiente");
			return getSaldo();
		}
	}

}
