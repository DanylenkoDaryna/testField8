package epam.module8.threads;

public class Interrupts {

    //    метод join,
////    предназначенный для перевода потока, который
////    вызвал этот метод в режим паузы до тех пор,
////    пока не закончит свою работу поток, на котором
////    этот метод был вызван.

    public static void main(String[] argv) throws InterruptedException {
        Thread a = new Thread(() -> {
            System.out.println("Thread A");
            try {
                Thread.sleep(3333);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread AA");
        });

        System.out.println("Thread main");
        a.start();
        System.out.println(Thread.currentThread().isInterrupted());
        Thread.currentThread().interrupt();//будет исключение!
        System.out.println(Thread.currentThread().isInterrupted());
        System.out.println(Thread.interrupted());
        System.out.println(Thread.currentThread().isInterrupted());
        a.join();
        System.out.println("main again or Exeption somewhere here");
        System.out.println("end");


    }
}
