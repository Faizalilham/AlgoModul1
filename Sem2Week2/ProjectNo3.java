package Sem2Week2;
public class ProjectNo3 {
    public static void main(String[] args) {
        int [][] A = {
            {1,2},
            {3,4}
           
        
        };
        int [][] B = {
            {5,6},
            {7,8}
            
        
        };
        int baris_a = A.length;
        int kolom_a = A[0].length;
        int baris_b = B.length;
        int kolom_b = B[0].length;
        int Hasil [][] = new int [baris_a][kolom_b];
        
        for(int i=0; i<A.length; i++){
           for(int j=0; j<kolom_b; j++){
               for(int k=0; k<kolom_a; k++){
                   Hasil [i][j] = Hasil[i][j] + (A[i][k] * B[k][j]) ;
                   
               }
           }
            
        }
        for(int[] x : Hasil){
            for(int kntl : x){
                System.out.print(kntl+" ");
            }
            System.out.println();
        }
    }
}
