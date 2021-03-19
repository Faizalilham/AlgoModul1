package Sem2Week2;
public class ModulWeek2 {
    public static void main(String[] args) {
        int matrix [][] = new int[2][2];
        matrix [0][0] = 1;
        matrix [0][1] = 2;
        matrix [1][0] = 4 ;
        matrix [1][1] = 5;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.println(matrix[i][j]+ " ");
                
            }
            
        }
    }
}
