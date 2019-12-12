/**
 * ThreadExtends
 */
public class ThreadImplements implements Runnable {
    public void run() {
        System.out.println("Perintah ini sedang dieksekusi oleh Thread \'" + Thread.currentThread().getName() + "\'");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thdMyThread = new Thread(new ThreadImplements() , "Thread 1");
        thdMyThread.start();
    }
}