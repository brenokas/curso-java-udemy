package aula114.app;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-07-22");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-21T22:33:30");
        Instant d06 = Instant.parse("2024-07-21T22:33:30Z");

        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        LocalDate nextWeekLocalDate = d04.plusWeeks(1);

        System.out.println("Local Date = " + d04);

        System.out.println("Local Date - 1 week = " + pastWeekLocalDate);
        System.out.println("Local Date + 1 week = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);

        System.out.println();
        System.out.println("Local Date Time = " + d05);

        System.out.println("Local Date Time - 1 week = " + pastWeekLocalDateTime);
        System.out.println("Local Date Time + 1 week = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("Instant = " + d06);

        System.out.println("Instant - 1 week = " + pastWeekInstant);
        System.out.println("Instant + 1 week = " + nextWeekInstant);

        System.out.println();
        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("Duration between " + pastWeekLocalDateTime + " and " + d05 + " = " + t1.toDays() + " days.");

        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("Duration between " + pastWeekLocalDate + " and " + d04 + " = " + t2.toDays() + " days.");

        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("Duration between " + pastWeekInstant + " and " + d06 + " = " + t3.toDays() + " days.");


    }
}
