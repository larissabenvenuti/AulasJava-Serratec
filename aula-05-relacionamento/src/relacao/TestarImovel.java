package relacao;

public class TestarImovel {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Larissa", "lari@gmail.com");
		Pessoa p2 = new Pessoa("Eduarda", "duda@gmail.com");

		Imovel i1 = new Imovel("Casa", 188000., p2);

		System.out.println(i1);

	}

}