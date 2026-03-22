package DSA_Basic_Algorithms.Matrices_2D;

import java.util.Arrays;

public class TransposeOfMatrix {

    public static void display(int[][] mat1){
        System.out.println("Printing the matrix : ");
        System.out.println("=================");
        for(int i = 0; i < mat1.length; i++){
            for(int j = 0; j < mat1[0].length; j++){
                System.out.print(mat1[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static int[][] transposeMatrix(int[][] mat){
        int totalRows = mat.length;
        int totalCols = mat[0].length;

        int[][] res = new int[totalCols][totalRows];

        for(int r = 0; r < res.length; r++){
            for(int c = 0; c < res[0].length; c++){
                res[r][c] = mat[c][r];
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[][] mat = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] res = transposeMatrix(mat);
//        System.out.println(Arrays.deepToString(res));
        display(res);
        }
    }
