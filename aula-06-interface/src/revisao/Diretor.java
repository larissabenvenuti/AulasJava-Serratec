package revisao;

public class Diretor extends Funcionario {
    private String categoria;

    public Diretor(String nome, Double salario, String turno, String categoria) {
        super(nome, salario, turno);
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "categoria: " + categoria + "\ndados: " + super.toString();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public void reajusteSalarial() {
        setSalario(getSalario() * 1.15);
    }
}
