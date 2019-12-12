/**
 * InterruptedThread
 */
public class InterruptedThread implements Runnable { 
    public void run() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Thread [" +Thread.currentThread().getName()+ "] sedang diinterupsi oleh Exception");
        }
        while(!Thread.interrupted()) {
            System.out.println("Thread [" +Thread.currentThread().getName()+ "] is working...");
        }
        System.out.println("Thread [" +Thread.currentThread().getName()+ "] diinterupsi lagi");
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thdThread = new Thread(new InterruptedThread(), "Si Tamvan");
        thdThread.start();

        System.out.println("Thread [" +Thread.currentThread().getName()+ "] sleep 5 detik"); Thread.sleep(5000);

        System.out.println("Thread [" +Thread.currentThread().getName()+ "] diinterupsi"); thdThread.interrupted();

        System.out.println("Thread [" +Thread.currentThread().getName()+ "] juga sleep 5 detik"); Thread.sleep(5000);

        System.out.println("Thread [" +Thread.currentThread().getName()+ "] diinterupsi"); thdThread.interrupted();
    }
}