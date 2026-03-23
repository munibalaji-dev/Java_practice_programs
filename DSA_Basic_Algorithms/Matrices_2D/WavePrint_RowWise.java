package DSA_Basic_Algorithms.Matrices_2D;
/*You are given an integer N and an N x N matrix.
Print all elements of the matrix in a row-wise wave traversal.*/
/*Input :
3
4 1 2        Output : 4 1 2 4 4 7 3 7 4
7 4 4
3 7 4 */

public class WavePrint_RowWise {
    public static void wavePrintRowWise(int[][] mat){
        for(int c = 0; c < mat[0].length; c++){
            if(c % 2 == 0){
                for(int r = 0; r < mat.length; r++){
                    System.out.print(mat[c][r]+" ");
                }
            }
            else{
                for(int r = mat.length-1; r >= 0; r--){
                    System.out.print(mat[c][r]+" ");
                }
            }
        }
    }
    public static void main(String[] args){
        int[][] mat = {
                {4, 1, 2},
                {7, 4, 4},
                {3, 7, 4}
        };
        wavePrintRowWise(mat);
    }
}
