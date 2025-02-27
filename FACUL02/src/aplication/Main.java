package aplication;


import entities.*;

public class Main {
    public static void main(String[] args) {
        
      
        ContaCorrente contaCorrente = new ContaCorrente(123, "Maria", 1500.00, 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca(456, "João", 2000.00);
        ContaInvestimento contaInvestimento = new ContaInvestimento(789, "Ana", 10000.00);
        ContaSalario contaSalario = new ContaSalario(101, "Carlos", 3000.00, 200.00);
        ContaInvestimentoAltoRisco contaInvestimentoAltoRisco = new ContaInvestimentoAltoRisco(202, "Lucas", 15000.00);
        
      
        System.out.println("\n** TESTE - CONTA CORRENTE **");
        contaCorrente.exibirInfo();
        contaCorrente.depositar(500.00);
        System.out.println("Saldo após depósito: " + contaCorrente.getSaldo());
        contaCorrente.sacar(1000.00); 
        System.out.println("Saldo após saque: " + contaCorrente.getSaldo());
        
       
        System.out.println("\n** TESTE - CONTA POUPANÇA **");
        contaPoupanca.exibirInfo();
        contaPoupanca.depositar(300.00);
        System.out.println("Saldo após depósito: " + contaPoupanca.getSaldo());
        contaPoupanca.sacar(1500.00);
        System.out.println("Saldo após saque: " + contaPoupanca.getSaldo());
        contaPoupanca.sacar(3000.00);
        
        
        System.out.println("\n** TESTE - CONTA INVESTIMENTO **");
        contaInvestimento.exibirInfo();
        contaInvestimento.depositar(1000.00);
        System.out.println("Saldo após depósito: " + contaInvestimento.getSaldo());
        contaInvestimento.sacar(5000.00);
        System.out.println("Saldo após saque: " + contaInvestimento.getSaldo());
        contaInvestimento.sacar(20000.00);
        
    
        System.out.println("\n** TESTE - CONTA SALÁRIO **");
        contaSalario.exibirInfo();
        contaSalario.depositar(200.00);
        System.out.println("Saldo após depósito: " + contaSalario.getSaldo());
        contaSalario.sacar(500.00); 
        System.out.println("Saldo após saque: " + contaSalario.getSaldo());
        contaSalario.sacar(300.00); 
        System.out.println("Saldo após saque: " + contaSalario.getSaldo());
        
        
        System.out.println("\n** TESTE - CONTA INVESTIMENTO ALTO RISCO **");
        contaInvestimentoAltoRisco.exibirInfo();
        contaInvestimentoAltoRisco.depositar(5000.00);
        System.out.println("Saldo após depósito: " + contaInvestimentoAltoRisco.getSaldo());
        contaInvestimentoAltoRisco.sacar(5000.00);
        System.out.println("Saldo após saque: " + contaInvestimentoAltoRisco.getSaldo());
        contaInvestimentoAltoRisco.sacar(1000.00); 
    }
}

