package aula;

public class ExemploGenerics<T> {
//Generic é o "Type Parameter", o "Element", etc
	private T valor;

	public ExemploGenerics(T valor) {
		super();
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "ExemploGenerics [valor=" + valor + "]";
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

}
