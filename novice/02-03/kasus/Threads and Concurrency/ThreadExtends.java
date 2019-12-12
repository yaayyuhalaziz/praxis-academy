/**
 * ThreadExtends
 */
public class ThreadExtends extends Thread {
    public ThreadExtends(String strNama) {
        super(strNama);
    }

    @Override
    public void run() {
        System.out.println("Perintah ini sedang dieksekusi oleh Thread \'" + Thread.currentThread().getName() + "\'");
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadExtends thdMyThread = new ThreadExtends("Thread 1");
        thdMyThread.start();
    }
}