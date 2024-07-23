package aula111.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Program {
    public static void main(String[] args) {

        //Instanciando meu formatador de data
        //Posso fazer o DateTimeFormatter.ofPattern("dd/MM/yyyy"); dentro do .parse()
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        //data local
        LocalDate d01 = LocalDate.now();
        //data e hora local
        LocalDateTime d02 = LocalDateTime.now();
        //data e hora global (GMT)
        Instant d03 = Instant.now();

        //texto ISO 8601 -> data-hora
        LocalDate d04 = LocalDate.parse("2024-07-21");
        LocalDateTime d05 = LocalDateTime.parse("2024-07-21T15:03:26");

        //usando instant
        Instant d06 = Instant.parse("2024-07-21T15:03:26Z");
        Instant d07 = Instant.parse("2024-07-21T15:03:26-03:00");

        //texto em formato customizado
        LocalDate d08 = LocalDate.parse("20/07/2024", formatter1);
        LocalDateTime d09 = LocalDateTime.parse("20/07/2024 01:30", formatter2);

        //passando dia, mes, ano, hora isoladamente
        LocalDate d10 = LocalDate.of(2024, 7, 21);
        LocalDateTime d11 = LocalDateTime.of(2024, 7, 21, 22, 31);

        System.out.println("Data local = " + d01);
        System.out.println("Data e hora local = " + d02);
        System.out.println("Data e hora global (GMT) = " + d03);
        System.out.println("Data -> ISO 8601 = " + d04);
        System.out.println("Data e Hora -> ISO 8601 = " + d05);
        System.out.println("Data e Hora global -> ISO 8601 = " + d06);
        System.out.println("Data e hora global com fuso -> ISO 8601 = " + d07);
        System.out.println("Texto em formato customizado = " + d08);
        System.out.println("Texto em formato customizado = " + d09);
        System.out.println("Separando os membros = " + d10);
        System.out.println("Separando os membros = " + d11);
    }
}
