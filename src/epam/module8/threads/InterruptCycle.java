package epam.module8.threads;

public class InterruptCycle implements Runnable{

    @Override
    public void run() {
        System.out.printf("%s started... \n", Thread.currentThread().getName());
        int counter=1; // счетчик циклов
        while(!Thread.currentThread().isInterrupted()){

            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s finished... \n", Thread.currentThread().getName());
    }

    public static void main(String[] argv) throws InterruptedException {
        System.out.println("Main thread started...");
        Thread t = new Thread(new InterruptCycle());
        t.start();
        try{
            Thread.sleep(50);
            t.interrupt();

            Thread.sleep(50);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Main thread finished...");
    }

}
