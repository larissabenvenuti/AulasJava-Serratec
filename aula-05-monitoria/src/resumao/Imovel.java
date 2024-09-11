package resumao;

public class Imovel {
	private String local;
	private Double valorImovel;

	public Imovel(String local, Double valorImovel) {
		super();
		this.local = local;
		this.valorImovel = valorImovel;
	}

	@Override
	public String toString() {
		return "\nLocal do imóvel: " + local + "\nValor do imóvel: " + valorImovel;
	}

	public String getLocal() {
		return local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	public Double getValorImovel() {
		return valorImovel;
	}

	public void setValorImovel(Double valorImovel) {
		this.valorImovel = valorImovel;
	}

	public Double calculaImpostoVenda() {
		return valorImovel * 1.275;
	}
}