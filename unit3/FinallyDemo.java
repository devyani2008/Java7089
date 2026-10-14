public class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 2;
            System.out.println("Result: " + a);
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}