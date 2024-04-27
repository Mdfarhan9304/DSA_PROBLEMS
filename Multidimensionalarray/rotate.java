public class rotate {
    public static void rotate(int arr[][]){
        int n= arr.length;
        for(int i=0; i<n; i++ ){
            for(int j=i+i; j<n; j++){
                int temp=arr[i][j];
                arr[i][j]= arr[j][i];
                arr[j][i]= temp;
            }
        }

        for(int k=0; k<n; k++){
            int top=0;
            int bottom=n-1;

            while(top < bottom){
                int temp= arr[top][k];
                arr[top][k]= arr[bottom][k];
                arr[bottom][k]=temp;
                top++;
                bottom--;
            }
        }

        for(int i=0; i<n; i++){
            for(int m=0; m<n; m++){
                System.out.print(arr[i][m]+ " ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int arr[][]= {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        rotate(arr);

    }
}
