package aplicaiton;

import entities.*;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 5, "Gasolina", "Esportivo");
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2020, 2, "Diesel", 10);
        Onibus onibus = new Onibus("Mercedes-Benz", "OF-1721", 2018, 40, "Diesel", 6);
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model S", 2023, 5, "Elétrico", 0, "Comum");
        CaminhaoRefrigerado caminhaoRefrigerado = new CaminhaoRefrigerado("Scania", "P360", 2021, 2, "Diesel", 8, -10);

        System.out.println("=== Informações dos Veículos ===");
        carro.exibirInfo();
        System.out.println();

        caminhao.exibirInfo();
        System.out.println();

        onibus.exibirInfo();
        System.out.println();

        carroEletrico.exibirInfo();
        System.out.println();

        caminhaoRefrigerado.exibirInfo();
    }
}
