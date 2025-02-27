package entities;

public class CarroEletrico extends Carro {
	private double bateriaKwh;

	public CarroEletrico(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, double bateriaKwh, String tipoCarro) {
		super(marca, modelo, ano, capacidadePassageiros, combustivel, tipoCarro);
		this.bateriaKwh = bateriaKwh;
	}
	
	 @Override
	    public double calcularAutonomia() {
	        return bateriaKwh * 5; 
	    }
	 
	 @Override
	    public void exibirInfo() {
	        super.exibirInfo();
	        System.out.println("Bateria (kWh): " + bateriaKwh);
	        System.out.println("Autonomia: " + calcularAutonomia() + " km");
	    }

}
