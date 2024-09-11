package revisao;

public class Marca {
	private String marca;
	private Integer codigo;
	public Marca(Integer codigo, String marca) {
		super();
		this.marca = marca;
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "\nMarca: " + marca + " & código: " + codigo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	
}
