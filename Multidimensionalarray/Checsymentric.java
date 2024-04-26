public class Checsymentric {
    public static boolean isSem(int matrix[][]){
        int row= matrix.length;
        int col= matrix[0].length;

        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(matrix[i][j] != matrix[j][i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int matrix[][]= {
            {1, 2, 3},
            {2, 8, 5},
            {3, 5, 6}
            
        };


        System.out.println(isSem(matrix));
    }
}
