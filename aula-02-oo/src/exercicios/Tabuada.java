package exercicios;

import javax.swing.JOptionPane;

public class Tabuada {

	public static void main(String[] args) {
		int n1;
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Escreva um número: "));

		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "x" + n1 + "=" + (i * n1));
		}
	}

}
