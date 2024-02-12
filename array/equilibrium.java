package array;

public class equilibrium {
    public static int equal(int arr[], int n){
        for(int i=0; i<n; i++){
            int left=0;
            int right=0;
            
            //left
            for(int j=0; j<i; j++){
                left+= arr[j];
            }
            // Right
            for(int k=i; k<n; k++){
                right+= arr[k];
            }

            if(left==right){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]= {1, 7, 3, 5, 6};
        int n= arr.length;
        System.out.println(equal(arr, n));
    }
}
