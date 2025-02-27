package entities;

public abstract class ContaBancaria {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String titular, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			return saldo;
		} else {
			System.out.println("Valor inválido para depósito.");
            return saldo;
		}
	}
	
	public abstract double sacar(double valor);
	
	public void exibirInfo() {
		System.out.println("Numero da conta: " + numeroConta);
		System.out.println("Titular: " + titular);
		System.out.println("Saldo: " + saldo);
	}

}
