package epam.module8.threads;

public class Test2 extends Thread {

    public void run(){

        while(true);
    } // бесконечный цикл

    public static void main(String[] argv) throws InterruptedException {

        Test2 t = new Test2();// главный поток создает поток test
        t.setDaemon(true); // делает его «демоном»
        t.start(); // запускает чтобы дочерний поток успел запуститься:
        Thread.sleep(3333);

    }// в данном месте главный поток завершает свое
// выполнение и JVM завершает работу
// приложения прерывая бесконечный цикл

}
