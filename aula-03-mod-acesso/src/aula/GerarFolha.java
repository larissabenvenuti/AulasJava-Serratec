package aula;

public class GerarFolha {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setCpf("12345678901");
		funcionario.setNome("Luísa");
		funcionario.setSalarioBruto(2000.);

		if (funcionario.getSalarioBruto() > 1402.) {
			System.out.println("Sal. Liq.:" + funcionario.calcularFolha());
			System.out.println("Folha gerada....");
		} else {
			System.out.println("Salário inválido");
		}
	}

}