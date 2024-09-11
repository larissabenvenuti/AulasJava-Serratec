package medicos;

public class Anestesista extends Medico {
	private String tipoAnestesia;

	public Anestesista(String nome, String nomeMedico, String crm, String tipoAnestesia) {
		super(nome, nomeMedico, crm);
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public String toString() {
		return "Anestesia: " + tipoAnestesia + "\nMédico: " + super.toString();
	}

	public String getTipoAnestesia() {
		return tipoAnestesia;
	}

	public void setTipoAnestesia(String tipoAnestesia) {
		this.tipoAnestesia = tipoAnestesia;
	}

	@Override
	public Double calcularPagamento() {
		return valorPago = super.calcularPagamento() + 2000;
	}
}