package entities;

public class ContaInvestimentoAltoRisco extends ContaInvestimento {

	public ContaInvestimentoAltoRisco(int numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
		
	}
	
		@Override
	    public double sacar(double valor) {
	        
	        if (getSaldo() >= 10000.0) {
	            if (valor > 0 && valor <= getSaldo()) {
	                
	                double taxa = valor * 0.05;
	                double valorTotal = valor + taxa; 

	                if (valorTotal <= getSaldo()) {
	                    setSaldo(getSaldo() - valorTotal); 
	                    System.out.println("Saque realizado com sucesso! A taxa de 5% foi aplicada.");
	                } else {
	                    System.out.println("Saque negado! Saldo insuficiente após aplicação da taxa.");
	                }

	                return getSaldo(); 
	            } else {
	                System.out.println("Saque negado! Saldo insuficiente.");
	                return getSaldo(); 
	            }
	        } else {
	            System.out.println("Saque negado! O saldo mínimo exigido para saque é R$ 10.000,00.");
	            return getSaldo(); 
	        }
	}

}
