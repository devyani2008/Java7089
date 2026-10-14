class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void checkMarks(int marks) throws InvalidMarksException {
        if (marks < 0 || marks > 100) {
            throw new InvalidMarksException("Invalid marks");
        } else {
            System.out.println("Valid marks");
        }
    }

    public static void main(String[] args) {
        try {
            checkMarks(105);
        } catch (InvalidMarksException e) {
            System.out.println(e.getMessage());
        }
    }
}