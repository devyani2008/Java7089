class Jatasya implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Jatasya's thread, count: " + i);
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Jatasya obj = new Jatasya();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}