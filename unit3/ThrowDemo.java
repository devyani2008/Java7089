public class ThrowDemo {
    public static void main(String[] args) {
        try {
            int age = 16;
            if (age < 18) {
                throw new ArithmeticException("Not eligible to vote");
            }
            System.out.println("Eligible to vote");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}