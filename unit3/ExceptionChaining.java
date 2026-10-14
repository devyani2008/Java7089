public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            NumberFormatException e = new NumberFormatException("Invalid number");
            e.initCause(new NullPointerException("Original cause"));
            throw e;
        } catch (NumberFormatException e) {
            System.out.println(e);
            System.out.println(e.getCause());
        }
    }
}