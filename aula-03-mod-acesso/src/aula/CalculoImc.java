package aula;

public class CalculoImc {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();

		p.setCodigo(123);
		p.setNome("Elisa");
		p.setAltura(1.65);
		p.setPeso(80.);

		System.out.println("Resultado:" + p.resposta());

	}
}