package entities;

public class ContaCorrente extends ContaBancaria {
	private double chequeEspecial;

	public ContaCorrente(int numeroConta, String titular, double saldo, double chequeEspecial) {
		super(numeroConta, titular, saldo);
		this.chequeEspecial = chequeEspecial;
	}

	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}

	@Override
	public double sacar(double valor) {
		double saldoTotal = getSaldo() + chequeEspecial;
		
		if(valor > 0 && valor <= saldoTotal) {
			setSaldo(getSaldo() - valor);
			return getSaldo();
		} else {
			System.out.println("Saque negado! Valor excede o saldo disponível + cheque especial.");
			return getSaldo();
		}
	}

}
