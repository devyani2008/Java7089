public class ExceptionPropagation {
    static void method1() {
        int a = 10 / 0;
    }

    static void method2() {
        method1();
    }

    static void method3() {
        try {
            method2();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        method3();
    }
}