import java.util.Scanner;

public class PenjumlahanMatriksPersegi {
    public int[][] setMatriks(int baris, int[][] arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nMasukkan elemen matrik berukuran " + baris + " x " + baris + "\n");
        for(int i = 1; i <= baris; i++) {
            for(int j = 1; j <= baris; j++) {
                System.out.print("Elemen ["+i+"]["+j+"]: ");
                arr[i][j] = input.nextInt();
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
        int[][] matriksA = new int[baris][baris];
        int[][] matriksB = new int[baris][baris];
        PenjumlahanMatriksPersegi opsMatriks = new PenjumlahanMatriksPersegi();
        matriksA = opsMatriks.setMatriks(baris, matriksA);
    }
}