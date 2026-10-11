package program;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Program {
    public static void main(String[] args){
        /*DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // -> para formatarmos as nossas datas.
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now(); -> londres
        LocalDate d04 = LocalDate.parse("2026-09-18");
        LocalDateTime d05 = LocalDateTime.parse("2026-09-18T13:47:30");
        Instant d06 = Instant.parse("2026-09-18T13:47:30Z");
        Instant d07 = Instant.parse("2026-09-18T13:47:30-03:00"); // -> o gmt - 3 que é o horario de SP

        LocalDate d08 = LocalDate.parse("18/09/2026",fmt1); // -> aqui usamos o fmt1 que criamos para formatar nossas datas
        LocalDateTime d09 = LocalDateTime.parse("18/09/2026 14:01",fmt2);// -> ele printa no forma iso8601 mas ele pega a infromação da forma que colocamos no format


*/
/*
        System.out.println("d01: " + d01); // nesses d01 é como se ja fosse um ToString nesses objetos.
        System.out.println("d02: " + d02);
        System.out.println("d03: " + d03);
        System.out.println("d04: " + d04);
        System.out.println("d05: " + d05);
*/


        /*System.out.println("d01: " + d01.toString()); // nesses d01 é como se ja fosse um ToString nesses objetos.
        System.out.println("d02: " + d02.toString());
        System.out.println("d03: " + d03.toString());
        System.out.println("d04: " + d04.toString());
        System.out.println("d05: " + d05.toString());
        System.out.println("d06: " + d06.toString());
        System.out.println("d07: " + d07.toString());
        System.out.println("d08: " + d08.toString());
        System.out.println("d09: " + d09.toString());*/


//        LocalDate d04 = LocalDate.parse("2026-09-18");




        LocalDate d04 = LocalDate.parse("2026-09-21");
        LocalDateTime d05 = LocalDateTime.parse("2026-09-21T10:52:26z");
        Instant d06 = Instant.parse("2026-09-21T10:52:26z");

        LocalDate pastWeekLocalDate = d04.minusDays(7);// aqui seria o dia d04 menos 7 dias
        LocalDate nextWeekLocalDate2 = d04.plusDays(7);


        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("pastWeekLocalDate = " + nextWeekLocalDate2);


        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.minusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDateTime);
        System.out.println("pastWeekLocalDate = " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());// a
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);


        System.out.println("t1 dias = " + t1.toDays() );
        System.out.println("t2 dias = " + t2.toDays() );
        System.out.println("t3 dias = " + t3.toDays() );
        System.out.println("t4 dias = " + t4.toDays() );






    }
}
