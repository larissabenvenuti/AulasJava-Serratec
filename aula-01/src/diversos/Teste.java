package diversos;

import javax.swing.JOptionPane;

public class Teste {
	public static void main(String[] args) {
		final int valor = 1000;
		double calculo = 0;
		boolean achei = false;
		char estadoCivil = 'S';
		String texto = "nome";
		System.out.println("Hello World! ");
		System.out.println("Java!" + texto);
		JOptionPane.showMessageDialog(null, "Hello World!");
		texto = JOptionPane.showInputDialog("Digite o seu nome:");
		JOptionPane.showMessageDialog(null, texto);
	}

}