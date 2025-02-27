package entities;

public class Carro extends Veiculo {
	private String tipoCarro;

	public Carro(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, String tipoCarro) {
		super(marca, modelo, ano, capacidadePassageiros, combustivel);
		this.tipoCarro = tipoCarro;
		
	}

	@Override
	public double calcularAutonomia() {
		int tanque = 50;
		double consumo = 12;
		return tanque * consumo;
	}
	
	@Override
	public void exibirInfo() {
		super.exibirInfo();
		System.out.println("Tipo de Carro: " + getTipoCarro());
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
	}

	public String getTipoCarro() {
		return tipoCarro;
	}

	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}

}
