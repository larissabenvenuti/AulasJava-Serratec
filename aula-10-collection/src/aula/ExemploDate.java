package aula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class ExemploDate {

	public static void main(String[] args) {
		/*
		 * Ultrapassados abaixo: Date dataAtual = new Date();
		 * System.out.println(dataAtual); System.out.println(dataAtual.getDate());
		 * System.out.println(dataAtual.getDay());
		 * 
		 * Calendar hoje = Calendar.getInstance();
		 * System.out.println(hoje.get(Calendar.YEAR));
		 */

		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);

		LocalDate entrada = LocalDate.of(2024, 9, 06);
		System.out.println(entrada.plusDays(30));
		System.out.println(entrada.isLeapYear());
		// Me dá 3 dias a mais pra entrada e vê se o ano é bissexto.

		LocalTime hora = LocalTime.now();
		System.out.println(hora);

		LocalTime horaEntrada = LocalTime.of(21, 29);
		System.out.println(horaEntrada);

		LocalDateTime dataHora = LocalDateTime.now();
		System.out.println(dataHora);

		ZoneId fuso = ZoneId.systemDefault();
		System.out.println(fuso);

		for (String f : ZoneId.getAvailableZoneIds()) {
			System.out.println(f);
		}
	}
}
