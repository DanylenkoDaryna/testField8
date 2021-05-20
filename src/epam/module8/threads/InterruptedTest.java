package epam.module8.threads;

public class InterruptedTest {

    public static void main(String[] argv) throws Exception {
        Thread t = Thread.currentThread();
        t.interrupt();
        System.out.println(t.isInterrupted());// true
        System.out.println(t.isInterrupted());// true
        System.out.println(Thread.interrupted());// true
        System.out.println(Thread.interrupted());// false
        System.out.println(Thread.interrupted());// false
    }
}
