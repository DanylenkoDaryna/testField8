package epam.module8.threads;

public class Main extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName());
        return;

    }

    public static void main(String[] args){
        System.out.println(Thread.currentThread());
        System.out.println(Thread.currentThread().getState());
        System.out.println(Thread.currentThread().getName());

        new Main().start();
        new Thread(new Child()).start();
        new Thread(() -> {
            System.out.println(Thread.currentThread());
            System.out.println(Thread.currentThread().getState());
            System.out.println(Thread.currentThread().getName());
        }).start();
    }
}

 class Child implements Runnable {

     @Override
     public void run() {
         System.out.println(Thread.currentThread());
         System.out.println(Thread.currentThread().getState());
         System.out.println(Thread.currentThread().getName());
     }
 }

