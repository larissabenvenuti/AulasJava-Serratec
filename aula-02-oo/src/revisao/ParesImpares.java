package revisao;

import javax.swing.JOptionPane;

public class ParesImpares {
	public static void main(String[] args) {
		for (int i = 1; i<=20; i++) {
			if(i % 2 == 0) 
			{
				System.out.println(i + " é Par");
			}
			else 
			{
				System.out.println(i+ " é Impar");
			}
		}
	}
}