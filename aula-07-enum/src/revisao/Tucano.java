package revisao;

import java.time.LocalDate;

public abstract class Tucano extends Ave {

	private double peso;

	public Tucano(String nome, LocalDate dataVacinacao, String cor, double peso) {
		super(nome, dataVacinacao, cor);
		this.peso = peso;
	}

	@Override
	public String voar() {
		return null;
	}

	@Override
	public String emitirSom() {
		return null;
	}

}
