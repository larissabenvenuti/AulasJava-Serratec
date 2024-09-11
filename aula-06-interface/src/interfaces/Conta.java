package interfaces;
//uma interface não pode ser instanciada
// não tem implementação
// atributos são final

public interface Conta {
	Double IMPOSTO = 10.0;
	void saque (Double valor);
	void deposito (Double valor);
}

