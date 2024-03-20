package com.core.utilityclasses;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateClass {

	public static void main(String[] args) {
		// dateMethods();
		// timeMethods();
		
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		DateTimeFormatter dfDate = DateTimeFormatter.ofPattern("EEEE, dd-MMMM-yyyy");
		DateTimeFormatter dfTime = DateTimeFormatter.ofPattern("hh:mm a");
		System.out.println(dfDate.format(date));
		System.out.println(dfTime.format(time));
	}
	
	

	void timeMethods() {
		
		
		
		LocalTime now = LocalTime.now();
		System.out.println("now = " + now);

		LocalTime zonedTime = LocalTime.now(ZoneId.of("America/New_York"));
		System.out.println("Zoned Time = " + zonedTime);

		LocalTime sessionStartTime = LocalTime.of(19, 0); // , 0, 0);
		System.out.println("Session Start Time = " + sessionStartTime);

		LocalTime sessionEndTime = LocalTime.parse("21:34:16.15");
		System.out.println("Session end Time = " + sessionEndTime);

		System.out.println("\nnow.isAfter(sessionStartTime) = " + now.isAfter(sessionEndTime));
		System.out.println("now.isAfter(sessionStartTime) = " + now.isBefore(sessionEndTime));

		System.out.println("\nnow.plusHours() = " + now.plusHours(3));
		System.out.println("now.plusMinutes() = " + now.plusMinutes(20));
		System.out.println("now.plusSeconds() = " + now.plusSeconds(87));
		System.out.println("now.plusNanos() = " + now.plusNanos(45));

		System.out.println("\nnow.minusHours() = " + now.minusHours(3));
		System.out.println("now.minusMinutes() = " + now.minusMinutes(20));
		System.out.println("now.minusSeconds() = " + now.minusSeconds(87));
		System.out.println("now.minusNanos() = " + now.minusNanos(45));

		Duration d = Duration.between(sessionStartTime, now);
		System.out.println("\nDuration between = " + d);
	}

	void dateMethods() {
		LocalDate today = LocalDate.now();
		System.out.println("Today = " + today);

		LocalDate zonedDate = LocalDate.now(ZoneId.of("America/New_York"));
		System.out.println("Zoned Date =" + zonedDate);

		LocalDate holi = LocalDate.of(2024, 3, 25);
		System.out.println("Holi = " + holi);

		LocalDate newYearsDay = LocalDate.parse("2024-01-01");
		System.out.println("New Year = " + newYearsDay);

		System.out.println("\nis Leap year ? " + newYearsDay.isLeapYear());

		System.out.println("today.isAfter(holi) = " + today.isAfter(holi));
		System.out.println("today.isBefore(holi) = " + today.isBefore(holi));

		System.out.println("\nplusDays() = " + today.plusDays(16));
		System.out.println("plusMonths() = " + today.plusMonths(2));
		System.out.println("plusYears() = " + today.plusYears(1));

		System.out.println("\nminusDays() = " + today.minusDays(16));
		System.out.println("minusMonths() = " + today.minusMonths(2));
		System.out.println("minusYears() = " + today.minusYears(1));

		Period p = Period.between(holi, today);
		System.out.println("\nPeriod between holi and today = " + p);
	}

}
