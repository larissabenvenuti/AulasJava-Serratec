package aula;

import javax.swing.JOptionPane;

public class Funcionario {

	private String cpf;
	private String nome;
	private Double salarioBruto;
	private static int total = 0;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getTotal() {
		return total;
	}

	public Double getSalarioBruto() {
		return salarioBruto;
	}

	public void setSalarioBruto(Double salarioBruto) {
		if (salarioBruto > 1402.) {
			this.salarioBruto = salarioBruto;
		} else {
			JOptionPane.showMessageDialog(null, "Salário Inválido");
		}
	}

	public Double calcularFolha() {
		registro();
		return salarioBruto * 0.83;
	}

	public static int registro() {
		return total++;
	}

}