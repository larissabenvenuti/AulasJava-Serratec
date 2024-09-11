package resumao;

public class MainSistema {

	public static void main(String[] args) {
		
		System.out.println("Local e Imposto de venda, respectivamente: ");
		
		Imovel imovel = new Imovel("25680-090", 250000.98);
		
		System.out.println(imovel.getLocal() + "\n" + imovel.calculaImpostoVenda());
		
		Proprietario proprietario = new Proprietario("Larissa", imovel);
		
		System.out.println("Nome, Local e valor do imóvel:");
		System.out.println(proprietario.getNome() + proprietario.getImovel());
	}
}