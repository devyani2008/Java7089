import java.util.GregorianCalendar;

public class GregorianCalendarDemo {
    public static void main(String[] args) {
        GregorianCalendar c = new GregorianCalendar();

        System.out.println("Year: " + c.get(GregorianCalendar.YEAR));
        System.out.println("Month: " + (c.get(GregorianCalendar.MONTH) + 1));
        System.out.println("Day: " + c.get(GregorianCalendar.DATE));
        System.out.println("Hour: " + c.get(GregorianCalendar.HOUR));
        System.out.println("Minute: " + c.get(GregorianCalendar.MINUTE));
        System.out.println("Second: " + c.get(GregorianCalendar.SECOND));
        System.out.println("Leap Year: " + c.isLeapYear(c.get(GregorianCalendar.YEAR)));
    }
}