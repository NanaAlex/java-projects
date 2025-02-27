package entities;

public class Onibus extends Veiculo {
	private int quantidadeEixos;

	public Onibus(String marca, String modelo, int ano, int capacidadePassageiros, String combustivel, int quantidadeEixos) {
		super(marca, modelo, ano, capacidadePassageiros, combustivel);
		
		if (quantidadeEixos < 6 || quantidadeEixos > 8) {
			throw new IllegalArgumentException("O número de eixos deve estar entre 6 e 8.");
		}
		
		this.quantidadeEixos = quantidadeEixos;
	}
	

	@Override
	public double calcularAutonomia() {
		int tanque = 200;
		double consumo = 5;
		return tanque * consumo;
	}
	
	@Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Quantidade de Eixos: " + quantidadeEixos);
        System.out.println("Autonomia: " + calcularAutonomia() + " km");
    }

}
