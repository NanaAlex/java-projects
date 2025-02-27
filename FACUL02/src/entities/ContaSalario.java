package entities;

public class ContaSalario extends ContaCorrente {
    private int saqueNoMes;

    public ContaSalario(int numeroConta, String titular, double saldo, double chequeEspecial) {
        super(numeroConta, titular, saldo, chequeEspecial);
        this.saqueNoMes = 0;
    }

    @Override
    public double sacar(double valor) {
        if (valor > 0 && valor <= getSaldo() + getChequeEspecial()) {
            if (saqueNoMes == 0) {
                setSaldo(getSaldo() - valor);
                saqueNoMes++;
                System.out.println("Saque realizado com sucesso! (Sem taxa)");
            } else {
                double valorComTaxa = valor + 5.0;
                if (valorComTaxa <= getSaldo() + getChequeEspecial()) {
                    setSaldo(getSaldo() - valorComTaxa);
                    System.out.println("Saque realizado com sucesso! (Taxa de R$ 5,00 aplicada)");
                } else {
                    System.out.println("Saque negado! Saldo insuficiente após a taxa.");
                }
            }
            return getSaldo();
        } else {
            System.out.println("Saque negado! Saldo insuficiente.");
            return getSaldo();
        }
    }

    public void reiniciarSaquesNoMes() {
        saqueNoMes = 0;
    }
}
