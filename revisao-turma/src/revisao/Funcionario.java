package revisao;

public class Funcionario {
	private Double salario;
	private String nome;

	public Funcionario(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Salário: " + salario + "\nNome: " + nome;
	}
	
	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void calcularSalario(Double salario) {
		this.salario = salario + 500.;
	}
		
}