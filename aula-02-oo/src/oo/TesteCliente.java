package oo;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Cliente c4 = new Cliente();

		c4 = null;

		Cliente c = new Cliente();

		c.nome = "Ana";
		c.nome.toUpperCase();

		c.cpf = "123";
		c.telefone = "22422090";

		c2.nome = "Ana";
		c3.nome = "José";

		if (c.nome.equals(c2.nome)) {
			System.out.println("Iguais");
		} else {
			System.out.println("Diferentes");
		}

		System.out.println(c.nome);
	}

}