package java13_themes;

public class MyThread1 implements Runnable {
    public void run() {
        System.out.println("Thread running");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
    }
}
