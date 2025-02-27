package entities;

public class Caminhao extends Veiculo {
    private int capacidadeCarga;

   
    public Caminhao(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int capacidadeCarga) {
        super(marca, modelo, ano, capacidadePassageiros, combustivel);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularAutonomia() {
        int tanque = 300;
        double consumoBase = 6;

 
        double reducao = Math.min(capacidadeCarga * 0.01, 0.25);
        double consumoReal = consumoBase * (1 - reducao);
        return tanque * consumoReal;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }
}
