package DSA_Basic_Algorithms.Matrices_2D;

import java.util.Arrays;

/*for addition of matrix -> dimension of both matrix should
        be same


        A[][] = [1, 2, 3]
                [4, 5, 6]
                [7, 8, 9]

        B[][] = [1, 4, 6]
                [3, 2, 1]
                [7, 3, 5]

        C[][] = A + B = [1 + 1 = 2, 2 + 4 = 6, 3 + 6 = 9]
                        [4 + 3 = 7, 5 + 2 = 7, 6 + 1 = 7]
                        [7 + 7 = 14, 8 + 3 = 11, 9 + 5 = 14]

    */
public class SumOfMatrix {
    public static void display(int[][] mat){
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[0].length; c++){
                System.out.print(mat[r][c]+ " ");
            }
            System.out.println();
        }
    }
    public static int[][] sumOfMatrix(int[][] A, int[][] B){
        int totalRows = A.length;
        int totalCols = A[0].length;
        int[][] res = new int[totalRows][totalCols];

        for(int r = 0; r < res.length; r++){
            for (int c = 0; c < res[0].length; c++){
                res[r][c] = A[r][c]+B[r][c];
            }
            System.out.println();
        }
        return res;
    }
    public static void main(String[] args){
        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] B = {
                {1, 4, 6},
                {3, 2, 1},
                {7, 3, 5}
        };

//        System.out.println(Arrays.deepToString(sumOfMatrix(A, B)));
        int[][] C = sumOfMatrix(A, B);
        display(C);
    }
}
