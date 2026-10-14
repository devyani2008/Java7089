class Vivan extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Vivan's thread, count: " + i);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Vivan t1 = new Vivan();
        t1.start();
    }
}