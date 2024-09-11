package exercicios;

import javax.swing.JOptionPane;

public class Medidas {

	public static void main(String[] args) {
		String[] nome = new String[4];
		Double[] peso = new Double[4];
		Double[] altura = new Double[4];

		for (int i = 0; i < nome.length; i++) {
			nome[i] = JOptionPane.showInputDialog("Digite seu nome: ");

			for (int j = 0; j < 1; j++) {
				altura[j] = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));

				for (int k = 0; k < 1; k++) {
					peso[k] = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso: "));
				}

			}
		}

	}
}