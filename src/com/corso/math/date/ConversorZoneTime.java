package com.corso.math.date;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ConversorZoneTime {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Inserisce una zona oraria (Europe/Rome, America/Mexico_City, Asia/Tokyo):");
		String zona = tastiera.nextLine();

		try {
			// Ora UTC
			ZonedDateTime oraUTC = ZonedDateTime.now(ZoneId.of("UTC"));
			// ora nella zona inserita tramite tastiera
			ZonedDateTime oraZona = ZonedDateTime.now(ZoneId.of(zona));
			// format
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss z");

			System.out.println("Ora UTC: " + oraUTC.format(formatter));
			System.out.println("Ora nella zona: " + zona + ": " + oraZona.format(formatter));

			// Diferenze in ore e minuti
			long ore = ChronoUnit.HOURS.between(oraUTC, oraZona);
			long minuti = ChronoUnit.MINUTES.between(oraUTC, oraZona) % 60;

			System.out.println(
					"Diferenze rispetto a UTC: " + (ore >= 0 ? "+" : "") + ore + " ore e " + minuti + " minuti");

		} catch (Exception e) {
			System.out.println("Zona oraria non valida");
		}
		tastiera.close();

	}

}
