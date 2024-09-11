package revisao;

import javax.swing.JOptionPane;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Larissa");
		Funcionario funcionario2 = new Funcionario("Larissa");

		Double testandoSalario = 0.;
		boolean continuar = true;

		do {
			try {
				testandoSalario = Double
						.parseDouble(JOptionPane.showInputDialog("Preencha com o salário do funcionário: "));
				 continuar = false;
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, "Insira dígitos em vez de caracteres");
			}
		} while (continuar == true);
		funcionario.calcularSalario(testandoSalario);
		JOptionPane.showMessageDialog(null, funcionario.toString());

	}

}
