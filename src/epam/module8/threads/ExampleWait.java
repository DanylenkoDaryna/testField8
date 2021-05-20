package epam.module8.threads;

public class ExampleWait extends Thread {
    public void run() {
// синхронизированный блок (монитор = this):
        synchronized (this) {
// перевод this в режим ожидания:
            try {
                wait();
                System.out.println("AAA");
                Thread.sleep(3333);
                System.out.println("BBB");
            } catch (Exception e) {
// вывести сообщение после прерывания:
                System.out.println("thread has been interrupted");
            }
        }
    }

    public static void main(String[] argv) throws Exception {
// создание и запуск потока:
        ExampleWait t = new ExampleWait();
        t.start();
// пауза в главном потоке, чтобы успел
// начать свое выполнение метод wait:
        Thread.sleep(3333);
        System.out.println("suk");

// главный поток входит в монитор t
// (= this в строке /*1*/)
// и выполняет вызов notify на монитор
// которым владеет главный поток
        synchronized (t) {
            t.notifyAll();
        }
// прервать запущенный поток:
        //t.interrupt();
    }
}
