
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.YYYY hh:mm:ss");
        System.out.println (formatter.format(now));
    }
}