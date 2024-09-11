package revisao;

public class Assistente extends Funcionario {
    private String tipo;

    public Assistente(String nome, Double salario, String turno, String tipo) {
        super(nome, salario, turno);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Tipo: " + tipo + "\nDados: " + super.toString();
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void reajusteSalarial() {
        setSalario(getSalario() * 1.05);
    }
}
