import java.util.Calendar;

public class DateAddSubtract {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        System.out.println("Current Date: " + c.getTime());

        c.add(Calendar.DATE, 5);
        System.out.println("After Adding 5 Days: " + c.getTime());

        c.add(Calendar.DATE, -5);
        System.out.println("After Subtracting 5 Days: " + c.getTime());

        c.add(Calendar.MONTH, 2);
        System.out.println("After Adding 2 Months: " + c.getTime());

        c.add(Calendar.MONTH, -2);
        System.out.println("After Subtracting 2 Months: " + c.getTime());
    }
}