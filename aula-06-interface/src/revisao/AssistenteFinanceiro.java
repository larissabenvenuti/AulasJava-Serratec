package revisao;

public class AssistenteFinanceiro extends Assistente {

    public AssistenteFinanceiro(String nome, Double salario, String turno, String tipo) {
        super(nome, salario, turno, tipo);
    }

    @Override
    public void reajusteSalarial() {
        setSalario(getSalario() * 1.07);
    }

    @Override
    public String toString() {
        return "Assistente Financeiro -\n" + super.toString();
    }
}
