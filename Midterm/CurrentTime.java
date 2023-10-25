import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
       
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy");
        String formattedDate = currentDate.format(formatter);

        System.out.println(formattedDate);
    }
}
