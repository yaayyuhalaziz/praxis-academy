public class PenjumlahanMatriks {
    public static void main(String args[]) {
        int[][] matriksA = {{1, 3, 5}, {4, 5, 2}, {3, 7, 2}}; // matrik ukuran 3x3
        int[][] matriksB = {{3, 1, 8}, {6, 9, 0}, {5, 7, 2}}; // matrik ukuran 3x3

        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.print(matriksA[i][j] + matriksB[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
