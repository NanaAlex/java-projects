package entities;

public class ContaInvestimento extends ContaBancaria {

	public ContaInvestimento(int numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
		
	}

	@Override
	public double sacar(double valor) {
		if (valor > 0 && valor <= getSaldo()) {
			 double taxa = valor * 0.02;
			 double valorComTaxa = valor + taxa;
			 
			 if (valorComTaxa <= getSaldo()) {
	                setSaldo(getSaldo() - valorComTaxa); 
	                System.out.println("Saque realizado com sucesso! A taxa de 2% foi aplicada.");
	            } else {
	                System.out.println("Saque negado! Saldo insuficiente após aplicação da taxa.");
	            }
	            return getSaldo(); 
	        } else {
	            System.out.println("Saque negado! Saldo insuficiente.");
	            return getSaldo(); 
	        
		}
	}
	
}
