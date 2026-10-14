import java.io.*;

public class ThrowsDemo {
    static void display() throws IOException {
        throw new IOException("Exception occurred");
    }

    public static void main(String[] args) {
        try {
            display();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}