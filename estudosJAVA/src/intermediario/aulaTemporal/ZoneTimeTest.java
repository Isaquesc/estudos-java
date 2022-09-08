package intermediario.aulaTemporal;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneTimeTest {
    public static void main(String[] args) {

        ZonedDateTime dataTokyo = Instant.now().atZone(ZoneId.of("Asia/Tokyo"));

        System.out.println(dataTokyo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));
    }
}
