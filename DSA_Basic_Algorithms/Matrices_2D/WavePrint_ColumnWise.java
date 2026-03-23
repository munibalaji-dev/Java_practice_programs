package DSA_Basic_Algorithms.Matrices_2D;

/*Problem Description:
Write a program to input an integer N and a N*N matrix Mat from user and print the matrix in wave form (column wise)
See example for clarifications regarding wave print.*/
// Input :
//3
//4 1 2     Output :  4 7 3 7 4 1 2 4 4
//7 4 4
//3 7 4
public class WavePrint_ColumnWise {
    public static void display(int mat[][]){
        for(int r = 0; r < mat.length; r++){
            for(int c = 0; c < mat[0].length; c++){
                System.out.print(mat[r][c]);
            }
            System.out.println();
        }
    }
    public static void printWaveColumnWise(int[][] matrixA){
        for(int c = 0; c < matrixA[0].length; c++) {
            if (c % 2 == 0){
                for(int r = 0; r < matrixA.length; r++){
                    System.out.print(matrixA[r][c]+" ");
                }
            }
            else {
                for (int r = matrixA.length-1; r >= 0; r--) {
                    System.out.print(matrixA[r][c]+" ");
                }
            }
        }
    }

    public static void main(String[] args){
        int[][] matrixA = {
                {4, 1, 2},
                {7, 4, 4},
                {3, 7, 4}
        };

        printWaveColumnWise(matrixA);

    }
}
