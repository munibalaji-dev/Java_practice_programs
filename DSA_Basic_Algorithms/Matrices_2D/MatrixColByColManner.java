package DSA_Basic_Algorithms.Matrices_2D;


public class MatrixColByColManner {

    public static void main(String[] args) {
        int[][] A = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        colByCol(A);

    }
    public static void colByCol(int[][] A) {
        for (int c = 0; c < A[0].length; c++) {
            for (int r = 0; r < A.length; r++) {
                System.out.print(A[r][c]+" ");
            }
            System.out.println();
        }
    }

}
