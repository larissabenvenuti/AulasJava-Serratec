package aula;

import java.util.HashMap;
import java.util.Map;

public class ExemploMap {
	public static void main(String[] args) {
		HashMap<String, String> estados = new HashMap<>();
		estados.put("RJ", "Rio de Janeiro");
		estados.put("SP", "São Paulo");
		estados.put("MG", "Minas Gerais");
		
		System.out.println("===============");
		for (Map.Entry<String, String> dados : estados.entrySet()) {
			System.out.println(dados.getKey() + "=" + dados.getValue());
			
		}
	}
}