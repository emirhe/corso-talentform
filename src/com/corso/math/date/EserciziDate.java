package com.corso.math.date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class EserciziDate {

	public static void main(String[] args) {
		//
		LocalDate oggi = LocalDate.now();
		System.out.println("la data di oggi: " + oggi);

		System.out.println("---------------");
		//
		LocalDate dateOggi = LocalDate.of(2025, 1, 1);
		System.out.println(dateOggi);

		System.out.println("---------------");
		//
		LocalDate futureDate = oggi.plusDays(30);
		System.out.println("tra 30 giorni sarà: " + futureDate);

		System.out.println("---------------");
		// Stampa il numero di giorni tra oggi e il 25 dicembre 2025.
		LocalDate nataleDate = LocalDate.of(2025, 12, 25);
		long numDays = ChronoUnit.DAYS.between(oggi, nataleDate);
		System.out.println("giorni finno a natate: " + numDays);

		System.out.println("---------------");
		// Controlla se il 1 gennaio 2000 è una data passata.
		LocalDate dataTest = LocalDate.of(2020, 1, 1);
		boolean past = dataTest.isBefore(oggi);
		System.out.println(dataTest + " è nel passato?: " + past);

		System.out.println("---------------");
		// Stampa l’anno, il mese e il giorno dalla data di oggi.
		System.out.println("Oggi siamo nel anno: " + oggi.getYear());
		System.out.println("Oggi siamo nel mese: " + oggi.getMonthValue());
		System.out.println("Oggi siamo nel giorno: " + oggi.getDayOfMonth());

		System.out.println("---------------");
		// Controlla se l’anno della data odierna è bisestile.
		boolean bisestile = oggi.isLeapYear();
		System.out.println("l'anno corrente è bisestile?: " + bisestile);

		System.out.println("---------------");
		// Dalla data di nascita 2000-04-15, calcola l’età attuale.
		LocalDate dataNac = LocalDate.of(2000, 04, 15);
		Period eta = Period.between(dataNac, oggi);
		System.out.println("Età attuale: " + eta.getYears());

		System.out.println("---------------");
		// Stampa il giorno della settimana per il 4 luglio 2025.
		LocalDate dateN = LocalDate.of(2025, 07, 4);
		DayOfWeek dayL = dateN.getDayOfWeek();
		System.out.println("il giorno de la settimana per: " + dateN + " : " + dayL);

		System.out.println("---------------");
		// Stampa oggi e i prossimi 4 giorni consecutivi.
		for (int i = 0; i < 5; i++) {
			System.out.println(oggi.plusDays(i));
		}

		System.out.println("---------------");
		// Stampa la data e l’ora correnti usando LocalDateTime
		LocalDateTime oggiTime = LocalDateTime.now();
		System.out.println("l'ora e data di oggi è: " + oggiTime);

		System.out.println("---------------");
		// Aggiungi 2 ore e 30 minuti alla data corrente utilizzando LocalDateTime
		LocalDateTime timePiu = oggiTime.plusHours(2).plusMinutes(30);
		System.out.println("l'ora attuale è: " + oggiTime + " è tra 2 hore e 30 min sarà: " + timePiu);

		System.out.println("---------------");
		// Calcola i minuti tra 14:15 e 16:45.
		long minPast = ChronoUnit.MINUTES.between(LocalTime.of(14, 15), LocalTime.of(16, 45));
		System.out.println("minuti trascorsi tra le 14:15 e 16:45: " + minPast);

		System.out.println("---------------");
		// Formatta la data 2025-03-10 nel formato 10/03/2025.
		LocalDate dateFormat = LocalDate.of(2025, 03, 10);
		DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("la data: " + dateFormat + " con formatazione: " + dateFormat.format(formatDate));

		System.out.println("---------------");
		// Trova il numero di giorni tra 2025-01-01T00:00 e la data corrente.
		long giorniPast = ChronoUnit.DAYS.between(LocalDateTime.of(2025, 01, 01, 00, 00), LocalDateTime.now());
		System.out.println("i giorni pasati tra 2025-01-01 / T00:00 e oggi sono: " + giorniPast);

		System.out.println("---------------");
		// Stampa il nome del mese corrente in italiano (maiuscolo).
		String meseCorrenteItaliano = LocalDate.now().getMonth().getDisplayName(TextStyle.FULL, Locale.ITALIAN);
		System.out.println("il nome del mese corrente è: " + meseCorrenteItaliano.toUpperCase());

		System.out.println("---------------");
		// Calcola la differenza tra 2000-04-01 e oggi in anni e mesi.
		LocalDate annoPast = LocalDate.of(2000, 04, 01);
		Period diferenzaTime = Period.between(annoPast, oggi);
		System.out.println("la differenza tra 2000-04-01 e oggi: " + diferenzaTime.getYears() + " anni "
				+ diferenzaTime.getMonths() + " mesi");

		System.out.println("----------------");
		// Mostra l’ora attuale a Tokyo usando ZonedDateTime.
		ZonedDateTime oraTokyo = ZonedDateTime.now(ZoneId.of("America/Mexico_City"));
		System.out.println("l'ora attuale a Tokyo è: " + oraTokyo.toLocalTime());

		System.out.println("----------------");
		// Stampa l’ultimo giorno del mese in corso.
		LocalDate ultGiorno = oggi.withDayOfMonth(oggi.lengthOfMonth());
		System.out.println("l'ultimo giorno del mese è: " + ultGiorno.getDayOfMonth() + "-" + ultGiorno.getDayOfWeek());

		System.out.println("----------------");
		// Dato un giorno qualsiasi, trova il giorno lavorativo successivo
		// (lunedì-venerdì).

		LocalDate dayRan = LocalDate.of(2025, 07, 11);
		do {
			dayRan = dayRan.plusDays(1);
		} while (dayRan.getDayOfWeek() == DayOfWeek.SATURDAY || dayRan.getDayOfWeek() == DayOfWeek.SUNDAY);
		System.out.println("il prossimo lavorativo: " + dayRan);

		System.out.println("----------------");
		// Trova la differenza in ore tra Roma e New York in questo momento.
		ZonedDateTime oraRoma = ZonedDateTime.of(2025, 7, 11, 12, 0, 0, 0, ZoneId.of("Europe/Rome"));
		ZonedDateTime oraNy = ZonedDateTime.of(2025, 7, 11, 12, 0, 0, 0, ZoneId.of("America/New_York"));

		long difOre = ChronoUnit.HOURS.between(oraNy, oraRoma);
		System.out.println("le ore di diferenza tra Roma e NY: " + difOre);

	}

}
