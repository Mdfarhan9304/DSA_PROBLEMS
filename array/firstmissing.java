package array;

public class firstmissing {
    public static int missnumber(int arr[], int n){
        for(int i=0; i<n; i++){
            if(arr[i] != i+1){
                return i+1;
            }
        }
        return n+1;
    }

    public static void main(String[] args) {
        int arr[]= {1, -5, -3, 2, 4, 5, 6};
        int n= arr.length; 
        int ans= missnumber(arr, n);
        System.out.println(ans);
    }
}
