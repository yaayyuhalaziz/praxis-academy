/**
 * MainThreads
 */
public class MainThreads {
    public static void main(String[] args) {
        long lngId = Thread.currentThread().getId();
        String strNama = Thread.currentThread().getName();
        int intPrioritas = Thread.currentThread().getPriority();
        //State staStatus = Thread.currentThread().getState();
        String strNamaKelompokThread = Thread.currentThread().getThreadGroup().getName();
        System.out.println("Informasi Tentang Thread");
        System.out.println("Id \t= " +lngId);
        System.out.println("Nama \t= " +strNama);
        System.out.println("Prioritas \t= " +intPrioritas);
        System.out.println("Statenya \t= " +Thread.currentThread().getState());
        System.out.println("Kelompok \t= " +strNamaKelompokThread);
    }
}