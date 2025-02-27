package entities;

public class CaminhaoRefrigerado extends Caminhao {
    private double temperaturaMinima;

    public CaminhaoRefrigerado(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int capacidadeCarga, double temperaturaMinima) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel, capacidadeCarga);  
        this.temperaturaMinima = temperaturaMinima;
    }

    @Override
    public double calcularAutonomia() {
        double autonomiaOriginal = super.calcularAutonomia();
        return autonomiaOriginal * 0.9;  
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Temperatura Mínima: " + temperaturaMinima + "°C");
        System.out.println("Autonomia (com refrigeração): " + calcularAutonomia() + " km");
    }
}
