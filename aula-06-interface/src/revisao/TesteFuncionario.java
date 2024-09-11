package revisao;

public class TesteFuncionario {

	public static void main(String[] args) {
		Assistente a = new Assistente("Roberto", 2200.0, "Noite", "Nível=1");
		Diretor d = new Diretor("Ana", 5000.0, "Dia", "Categoria A");
		AssistenteFinanceiro af = new AssistenteFinanceiro("João", 2500.0, "Tarde", "Financeiro");

		a.reajusteSalarial();
		d.reajusteSalarial();
		af.reajusteSalarial();

		System.out.println(a);
		System.out.println(d);
		System.out.println(af);
	}
}
