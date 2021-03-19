package Sem2Week2;
public class ProjectNo2 {
    public static void main(String[] args) {
        int[][] X = {
        {1,2},
        {3,4},
        {5,6}
    };
    int[][] Y = {
        {10,20},
        {30,40},
        {50,60}
    };
    int baris_x = X.length;
    int kolom_x = X[0].length;
    int[][] Hasil = new int [baris_x][kolom_x];
    
    for(int i=0; i<baris_x; i++){
       for(int j=0; j<kolom_x; j++) {
           Hasil [i][j] = Y[i][j] - X[i][j];
           System.out.print(Hasil[i][j]+" ");
       }
        System.out.println();
         
        }
}
    
  

    
}
