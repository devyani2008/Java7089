import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();

        SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");
        SimpleDateFormat f2 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat f3 = new SimpleDateFormat("dd-MMM-yyyy");
        SimpleDateFormat f4 = new SimpleDateFormat("EEEE, dd MMMM yyyy");

        System.out.println(f1.format(date));
        System.out.println(f2.format(date));
        System.out.println(f3.format(date));
        System.out.println(f4.format(date));
    }
}   