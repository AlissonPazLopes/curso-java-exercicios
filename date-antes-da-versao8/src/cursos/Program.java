package cursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sfd1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sfd2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date x1 = new Date();// criando a data com horario de agora
        Date x2 = new Date(System.currentTimeMillis());// pega os milissegundo
        Date x3 = new Date(0L);
        Date x4 = new Date( 1000L * 60L * 60L * 5L );

        Date y1 = sfd1.parse("21/06/2026");
        Date y2 = sfd2.parse("21/06/2026 11:55:07");



        System.out.println("y1 = " + y1);
        System.out.println("y2 = " + y2);

        System.out.println("x1 = " + sfd2.format(x1));
        System.out.println("y1 = " + sfd2.format(y1));
        System.out.println("y2 = " + sfd2.format(y2));





    }

}
