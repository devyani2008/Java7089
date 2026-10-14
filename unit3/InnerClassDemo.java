public class InnerClassDemo {
    class Inner {
        void display() {
            System.out.println("This is an inner class");
        }
    }

    public static void main(String[] args) {
        InnerClassDemo obj = new InnerClassDemo();
        Inner in = obj.new Inner();
        in.display();
    }
}