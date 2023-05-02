import java.nio.charset.Charset;
import java.time.LocalTime;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String charsetName;
        Scanner in = new Scanner(System.in, charsetName="866");
        System.out.printf("ведите имя: ");
        String userName= in.nextLine();
        System.out.printf("Привет, %s! ", userName);
        LocalTime myTime = LocalTime.now();
        if (myTime.getHour() >= 5 && myTime.getHour() < 12) {
            System.out.printf("Доброе утро, %s!", userName);
            }
        else if (myTime.getHour() >= 12 && myTime.getHour() < 18) {
            System.out.printf("Добрый день, %s!", userName);}
        in.close();
    }
    
}
