public class ThreadPriorityDemo extends Thread {
    public void run() {
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ThreadPriorityDemo t1 = new ThreadPriorityDemo();
        ThreadPriorityDemo t2 = new ThreadPriorityDemo();

        t1.setName("First Thread");
        t2.setName("Second Thread");

        t1.setPriority(3);
        t2.setPriority(8);

        t1.start();
        t2.start();
    }
}