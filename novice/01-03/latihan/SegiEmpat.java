class BangunSegiEmpat { // Parent Class
    public void getLuas(int panjang, int lebar) { //Method untuk menghitung dan menampilkan luas Bangun Segi Empat
        System.out.println("Luast Segi Empat  = "+panjang * lebar);
    }
}

class Persegi extends BangunSegiEmpat { // Child Class Persegi yang mewarisi Method getLuas dari Kelas BangunSegiEmpat
    // Overload di Java (bukan @Override)
    public void getLuas(int sisi) {
        System.out.println("\nBangun " +getClass().getSimpleName());
        System.out.println("Panjang sisi = "+sisi);
        System.out.println("Luas (sisi x sisi) = "+(int)Math.pow(sisi, 2));
    }
}

class PersegiPanjang extends BangunSegiEmpat { // Child Class Persegi Panjang yang mewarisi Method getLuas dari Kelas BangunSegiEmpat
    @Override // Menggunakan Anotasi @Override untuk mengganti statemen blok method getLuas
    public void getLuas(int panjang, int lebar) {
        System.out.println("\nBangun " +getClass().getSimpleName());
        System.out.println("Panjang = "+panjang+"; Lebar = "+lebar);
        System.out.println("Luas (panjang x lebar) = "+panjang * lebar);
    }
}

class JajarGenjang extends BangunSegiEmpat {// Child Class Jajar Genjang yang mewarisi Method getLuas dari Kelas BangunSegiEmpat
    @Override // Menggunakan Anotasi @Override untuk mengganti statemen blok method getLuas
    public void getLuas(int alas, int tinggi) {
        System.out.println("\nBangun " +getClass().getSimpleName());
        System.out.println("Alas = "+alas+"; Tinggi = "+tinggi);
        System.out.println("Luas (alas x tinggi) = "+alas * tinggi);
    }
}

/**
 * Menggunakan Anotasi @Override
 * <p>File ini mengimplementasikan Anotasi Override pada Kelas Child</p>
 * @author  yaayyuhalaziz
 * @version 1.0
 */
public class SegiEmpat { // Kelas SegiEmpat yang didalamnya terdapat kelas Utama (main)
    public static void main(String[] args) {
        Persegi objPersegi = new Persegi(); // Instantiasi objek Persegi
        objPersegi.getLuas(6); // Mendapatkan Luas Persegi dari method getLuas() pada Kelas Persegi

        PersegiPanjang objPersegiPanjang = new PersegiPanjang(); // Instantiasi objek Persegi Panjang
        objPersegiPanjang.getLuas(6, 5); // Mendapatkan Luas Persegi dari method getLuas() pada Kelas Persegi Panjang

        JajarGenjang objJajarGenjang = new JajarGenjang();  // Instantiasi objek Jajar Genjang
        objJajarGenjang.getLuas(7, 6);  // Mendapatkan Luas Persegi dari method getLuas() pada Kelas Jajar Genjang
    }
}