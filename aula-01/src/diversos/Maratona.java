package diversos;

import javax.swing.JOptionPane;

public class Maratona {
	/*
	 * Fazer a leitura de dois valores altura e idade Se idade >=18 ou altura maior
	 * que 1.60 Participará da maratona senão não participará
	 */

	public static void main(String[] args) {
		double altura, idade;

		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
		idade = Double.parseDouble(JOptionPane.showInputDialog("Digite sua idade: "));
		if (altura >= 1.60 || idade >= 18) {
			System.out.println("Pode participar");
		} else {
			System.out.println("Não pode participar");
		}
	}
}