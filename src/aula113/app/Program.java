package aula113.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-07-21");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-21T22:33:30");
        Instant d06 = Instant.parse("2024-07-21T22:33:30Z");

        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("Data convertida para o fuso-horário do computador: " + r1);
        System.out.println("Data convertida para o fuso-horário de Portugal: " + r2);
        System.out.println();
        System.out.println("Data e hora convertida para o fuso-horário do computador: " + r3);
        System.out.println("Data e hora convertida para o fuso-horário de Portugal: " + r4);
        System.out.println();
        System.out.println("Pegando o dia de uma data = " + d04.getDayOfMonth());
        System.out.println("Pegando o mes de uma data = " + d04.getMonthValue());
        System.out.println("Pegando o mes de uma data = " + d04.getMonth());
        System.out.println("Pegando o ano de uma data = " + d04.getYear());
        System.out.println("Pegando uma hora que está guardada = " + d05.getHour());
        System.out.println("Pegando um minuto que está guardado = " + d05.getMinute());
    }
}
