import java.util.Scanner;

public class PenjumlahanMatriksPersegi {
    public int[][] setMatriks(int baris, int[][] arr) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan elemen matrik berukuran " + baris + " x " + baris + "\n");
        for(int i = 1; i <= baris; i++) {
            for(int j = 1; j <= baris; j++) {
                System.out.print("Elemen ["+i+"]["+j+"]: ");
                arr[i][j] = in.nextInt();
            }
        }
        return arr;
    }

    public void getMatriks(int baris, int[][] arr) {
        for(int i = 1; i <= baris; i++) {
            for(int j = 1; j <= baris; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void penjumlahanMatriks(int[][] matriksA, int[][] matriksB, int baris) {
        for(int i = 1; i <= baris; i++) {
            for(int j = 1; j <= baris; j++) {
                System.out.print(matriksA[i][j] + matriksB[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Penjumlahan matrik Bujur Sangkar n x n.\nTuliskan jumlah kolom atau baris: ");
        int baris = input.nextInt();
        int[][] matriksA = new int[baris+1][baris+1];
        int[][] matriksB = new int[baris+1][baris+1];
        PenjumlahanMatriksPersegi opsMatriks = new PenjumlahanMatriksPersegi();
        System.out.println("\nMatriks A\n");
        matriksA = opsMatriks.setMatriks(baris, matriksA);
        System.out.println("\nMatriks B\n");
        matriksB = opsMatriks.setMatriks(baris, matriksB);
        System.out.println("\nMatriks A\n");
        opsMatriks.getMatriks(baris, matriksA);
        System.out.println("\nMatriks B\n");
        opsMatriks.getMatriks(baris, matriksB);
        System.out.println("\nPenjumlahan keduanya menghasilkan Matriks:\n");
        opsMatriks.penjumlahanMatriks(matriksA, matriksB, baris);
    }
}