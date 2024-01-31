package array;

public class secondlargest {
  
public static int slargest(int a[], int n){
        int largest= a[0];
        int slargest= Integer.MIN_VALUE;
        for(int i=1; i<n; i++){
            if(a[i]> largest){
                slargest= largest;
                largest= a[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int arr[]= {23, 78, -98, 32, -42};
        int n= arr.length;
        System.out.println(slargest(arr, n));

    }
}
