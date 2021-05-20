package epam.module8.threads;

public class TestWait {

    private static int x;

    public static void main(String[] argv){
        Thread a = new Thread(() -> {
            method1();
        });
        a.start();
        method1();
        System.out.println("asdfasdfasdf");

    }

    public synchronized static void method1(){
        System.out.println(x + Thread.currentThread().getName());
        try {
            TestWait.class.wait(33333);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        x=x+1;
        System.out.println(x + Thread.currentThread().getName());
    }
}
