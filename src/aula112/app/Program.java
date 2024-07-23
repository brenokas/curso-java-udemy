package aula112.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2024-07-21");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-21T22:33:30");
        Instant d06 = Instant.parse("2024-07-21T22:33:30Z");

        //Transformando as datas de forma livre

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter formatter4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter formatter5 = DateTimeFormatter.ISO_INSTANT;

        System.out.println("Data normalzona = " + d04.format(formatter1));
        System.out.println("Data normalzona = " + formatter1.format(d04));
        System.out.println("Data normalzona = " + d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        System.out.println();
        System.out.println("Data e hora (formatador 1) = " + d05.format(formatter1));
        System.out.println("Data e hora (formatador 2) = " + d05.format(formatter2));
        System.out.println("Data e hora (formatador 4) = " + d05.format(formatter3));
        System.out.println();
        System.out.println("Data e hora global (formatador 3) = " + formatter3.format(d06));
        System.out.println("Data e hora global (formatador 5) = " + formatter5.format(d06));

    }
}
