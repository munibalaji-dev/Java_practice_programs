package DSA_Basic_Algorithms.Matrices_2D;

public class IdentityMatrix {

    public static boolean checkIdentityMatrix(int[][] A){

        int r1 = A.length;
        int c1 = A[0].length;
        if(r1 != c1){ // Identity matrix must be square (n × n)
           return false;
        }
        for(int i = 0; i < r1; i++){
            for(int j = 0; j < c1; j++){
                int val = A[i][j];
                if(i == j){

                    // Diagonal position
                    if(val != 1){
                        return false;
                    }
                }
                else {
                    // Non diagonal position
                    if(val != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] A = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        System.out.println(checkIdentityMatrix(A));
    }
}
