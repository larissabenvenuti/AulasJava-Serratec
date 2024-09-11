package banco;

public class Conta {
	public Integer numero;
	public String titular;
	public Double saldo;

	public void deposito(Double valor) {
		if (valor <= 0) {
			System.out.println("Valor inválido!");
		} else {
			saldo += valor;
			System.out.println("Depósito efetuado!");
		}
	}

	public boolean saque(Double valor) {
		if (saldo < valor) {
			return false;
		} else {
			saldo -= valor;
			return true;
		}
	}

	public static void imprimir() {

		System.out.println("Teste de Static!");

	}

}