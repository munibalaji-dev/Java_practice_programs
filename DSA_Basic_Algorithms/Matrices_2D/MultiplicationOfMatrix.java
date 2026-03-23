package DSA_Basic_Algorithms.Matrices_2D;

public class MultiplicationOfMatrix {


    // For to display the matrix
    public static void display(int[][] mat){
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[0].length; c++){
                System.out.print(mat[r][c]+ " ");
            }
            System.out.println();
        }
    }


    public static int[][] multiplicationOfMatrix(int[][] A, int[][] B) {
        int r1 = A.length;
        int c1 = A[0].length;
        int r2 = B.length;
        int c2 = B[0].length;

        if (c1 != r2) {
            System.out.println("In this matrices multiplication cannot be happen");
            int[][] cres = new int[r1][c1];
        }

        int[][] res = new int[r1][c2];

        for (int r = 0; r < res.length; r++) {
            for (int c = 0; c < res[0].length; c++) {
                int val = 0;
                //for(int k = 0; k < c1; k++){
                //          (or)
                for (int k = 0; k < r2; k++) {
                    val += A[r][k] * B[k][c];  // Here, in A[][] r constant k moving row wise, B[][] k moving column wise and c will be constant
                }
                res[r][c] = val;
            }
        }
        return res;
    }

    public static void main(String[] args){
        int[][] A = {
                {2, 3},
                {4, 0},
                {1, 7}
        };

        int[][] B = {
                {7, 2, 1},
                {0, 4, 3}
        };

        int[][] C = multiplicationOfMatrix(A, B);
        display(C);
    }
}
